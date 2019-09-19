package io.swagger.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swagger.model.Empleado;
import io.swagger.model.repository.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	private EmpleadoRepository empleadoRepository;

	public void setEmpleadoRepository(EmpleadoRepository empleadoRepository) {
		this.empleadoRepository = empleadoRepository;
	}

	@Override
	public void registrarEmpleado(Empleado employee) {
		System.out.println(employee);
		empleadoRepository.save(employee);

	}

	@Override
	public Empleado getEmployee(int employeeId) {
		Empleado optEmp = empleadoRepository.findOne(employeeId);

		return optEmp;
	}

	@Override
	public Empleado autenticarEmpleado(String usuario, String password) {
		Empleado autEmp = empleadoRepository.getEmplByUseAndPass(usuario, password);
		return autEmp;

	}

	@Override
	public Empleado inactivarEmpleado(int employeeId) {
		Empleado empleado = empleadoRepository.findOne(employeeId);
		if (empleado.getEstado().equals("ACTIVO")) {
			empleado.setEstado("INACTIVO");
		} else {
			empleado.setEstado("ACTIVO");
		}
		empleadoRepository.save(empleado);
		return empleado;
	}

	@Override
	public List<Empleado> listarEmpleados() {
		return empleadoRepository.findAll();
	}

}
