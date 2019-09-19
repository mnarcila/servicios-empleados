package io.swagger.api;

import io.swagger.model.AutenticarRsType;
import io.swagger.model.Empleado;
import io.swagger.model.EmpleadoRsType;
import io.swagger.model.PostRsType;
import io.swagger.model.StatusType;
import io.swagger.service.EmpleadoService;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-15T18:38:52.094Z")

@Controller
public class EmpleadoApiController implements EmpleadoApi {
	
	@Autowired
	private EmpleadoService empleadoService;

    private static final Logger log = LoggerFactory.getLogger(EmpleadoApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public EmpleadoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<StatusType> actualizarEmpleadoPorId(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKall3" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "Id del empleado a inactivar/activar",required=true) @PathVariable("idEmpleado") Integer idEmpleado) {
        String accept = request.getHeader("Accept");
        
        if (accept != null && accept.contains("application/json")) {
        	empleadoService.inactivarEmpleado((idEmpleado));
			return new ResponseEntity<StatusType>(new StatusType(200,"Actualizacion Realizada Correctamente"), HttpStatus.OK);
        }

        return new ResponseEntity<StatusType>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AutenticarRsType> autenticarEmpleado(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKall3" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "Id del empleado a consultar",required=true) @PathVariable("usuario") String usuario,@ApiParam(value = "Passdel empleado a consultar",required=true) @PathVariable("pass") String pass) {
        String accept = request.getHeader("Accept");
        System.out.println("usuario|"+usuario +"|pass|"+pass);
        if (accept != null && accept.contains("application/json")) {
            boolean autenticar =false;
            AutenticarRsType response = new AutenticarRsType();
			
			if(empleadoService.autenticarEmpleado(usuario, pass) ==null) {
				autenticar=false;
			}else {
				autenticar=true;
			} 
			System.out.println("resp:"+autenticar);
			response.setAutenticacion(autenticar);
			response.setStatus(new StatusType(200,"OK"));
			return new ResponseEntity<AutenticarRsType>(response, HttpStatus.OK);
        }
        return new ResponseEntity<AutenticarRsType>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<EmpleadoRsType> consultarEmpleadoPorId(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKall3" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "Id del empleado a consultar",required=true) @PathVariable("idEmpleado") Integer idEmpleado) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
        	EmpleadoRsType empleadoResponse = new EmpleadoRsType();
        	empleadoResponse.setEmpleado(empleadoService.getEmployee(idEmpleado));
			empleadoResponse.setStatus(new StatusType(000,"Consulta Realizada Correctamente"));
			return new ResponseEntity<EmpleadoRsType>(empleadoResponse, HttpStatus.OK);
        }

        return new ResponseEntity<EmpleadoRsType>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PostRsType> registrarEmpleado(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKall3" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "Empleado a registrar" ,required=true )  @Valid @RequestBody Empleado empleado) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            empleadoService.registrarEmpleado(empleado);  
			
            PostRsType response = new PostRsType();
            response.setIdEmpleadoCreado(empleado.getIdEmpleado());
            response.setStatus(new StatusType(200,"Insercion Realizada Correctamente"));
			
			return new ResponseEntity<PostRsType>(response, HttpStatus.OK);
        }

        return new ResponseEntity<PostRsType>(HttpStatus.NOT_IMPLEMENTED);
    }

}
