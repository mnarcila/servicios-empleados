package io.swagger.api;

import io.swagger.model.EmpleadosRsType;
import io.swagger.model.ParamSalidaTypeEmpleados;
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
public class EmpleadosApiController implements EmpleadosApi {
	
	@Autowired
	private EmpleadoService empleadoService;

    private static final Logger log = LoggerFactory.getLogger(EmpleadosApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public EmpleadosApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<EmpleadosRsType> consultarEmpleados(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKall3" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) { 
        	
        	ParamSalidaTypeEmpleados param = new ParamSalidaTypeEmpleados();
        	param.addAll(empleadoService.listarEmpleados());
        	
            EmpleadosRsType response = 
            		new EmpleadosRsType(new StatusType(200,"Consulta Realizada Correctamente")
            				, param);
			return new ResponseEntity<EmpleadosRsType>(response, HttpStatus.OK);
        }

        return new ResponseEntity<EmpleadosRsType>(HttpStatus.NOT_IMPLEMENTED);
    }

}
