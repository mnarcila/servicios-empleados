package io.swagger.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import io.swagger.model.Empleado;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado,Integer>{
	
	
	//@Query(value="SELECT p FROM SEGEMPLEADO p WHERE LOWER(p.usuario) = LOWER(:usuario) and LOWER(p.CLAVE) = LOWER(:CLAVE) ", nativeQuery = true)
	@Query(value="SELECT * FROM SEGEMPLEADO  WHERE usuario = ?1 AND CLAVE =?2", nativeQuery = true)
	Empleado getEmplByUseAndPass(String usuario, String password);
}
