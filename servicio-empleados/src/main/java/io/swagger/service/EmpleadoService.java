package io.swagger.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import io.swagger.model.Empleado;

public interface EmpleadoService {
	
	public void registrarEmpleado(Empleado employee);
	public Empleado getEmployee(int employeeId);	
	public Empleado autenticarEmpleado(String usuario, String password);
	public Empleado inactivarEmpleado(int employeeId);
	public List<Empleado> listarEmpleados();
}
