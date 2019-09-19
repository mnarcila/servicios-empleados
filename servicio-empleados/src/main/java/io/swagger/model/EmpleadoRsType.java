package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Empleado;
import io.swagger.model.StatusType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EmpleadoRsType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-15T18:38:52.094Z")

public class EmpleadoRsType   {
  public EmpleadoRsType(StatusType status, Empleado empleado) {		
		this.status = status;
		this.empleado = empleado;
	}
  
  public EmpleadoRsType() {				
	}


@JsonProperty("status")
  private StatusType status = null;

  @JsonProperty("empleado")
  private Empleado empleado = null;

  public EmpleadoRsType status(StatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")

  @Valid

  public StatusType getStatus() {
    return status;
  }

  public void setStatus(StatusType status) {
    this.status = status;
  }

  public EmpleadoRsType empleado(Empleado empleado) {
    this.empleado = empleado;
    return this;
  }

  /**
   * Get empleado
   * @return empleado
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Empleado getEmpleado() {
    return empleado;
  }

  public void setEmpleado(Empleado empleado) {
    this.empleado = empleado;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmpleadoRsType empleadoRsType = (EmpleadoRsType) o;
    return Objects.equals(this.status, empleadoRsType.status) &&
        Objects.equals(this.empleado, empleadoRsType.empleado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, empleado);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmpleadoRsType {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    empleado: ").append(toIndentedString(empleado)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

