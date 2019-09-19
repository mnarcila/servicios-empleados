package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ParamSalidaTypeEmpleados;
import io.swagger.model.StatusType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Respuesta genérica.
 */
@ApiModel(description = "Respuesta genérica.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-15T18:38:52.094Z")

public class EmpleadosRsType   {
  public EmpleadosRsType(StatusType status, ParamSalidaTypeEmpleados empleados) {
		this.status = status;
		this.empleados = empleados;
	}
  
  public EmpleadosRsType() {
	}

@JsonProperty("status")
  private StatusType status = null;

  @JsonProperty("empleados")
  private ParamSalidaTypeEmpleados empleados = null;

  public EmpleadosRsType status(StatusType status) {
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

  public EmpleadosRsType empleados(ParamSalidaTypeEmpleados empleados) {
    this.empleados = empleados;
    return this;
  }

  /**
   * Get empleados
   * @return empleados
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ParamSalidaTypeEmpleados getEmpleados() {
    return empleados;
  }

  public void setEmpleados(ParamSalidaTypeEmpleados empleados) {
    this.empleados = empleados;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmpleadosRsType empleadosRsType = (EmpleadosRsType) o;
    return Objects.equals(this.status, empleadosRsType.status) &&
        Objects.equals(this.empleados, empleadosRsType.empleados);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, empleados);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmpleadosRsType {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    empleados: ").append(toIndentedString(empleados)).append("\n");
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

