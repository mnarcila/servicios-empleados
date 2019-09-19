package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.StatusType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AutenticarRsType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-15T18:38:52.094Z")

public class AutenticarRsType   {
  public AutenticarRsType(StatusType status, Boolean autenticacion) {
		this.status = status;
		this.autenticacion = autenticacion;
	}
  public AutenticarRsType() {
		
	}

@JsonProperty("status")
  private StatusType status = null;

  @JsonProperty("autenticacion")
  private Boolean autenticacion = null;

  public AutenticarRsType status(StatusType status) {
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

  public AutenticarRsType autenticacion(Boolean autenticacion) {
    this.autenticacion = autenticacion;
    return this;
  }

  /**
   * Estado de autenticacion
   * @return autenticacion
  **/
  @ApiModelProperty(value = "Estado de autenticacion")


  public Boolean isAutenticacion() {
    return autenticacion;
  }

  public void setAutenticacion(Boolean autenticacion) {
    this.autenticacion = autenticacion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutenticarRsType autenticarRsType = (AutenticarRsType) o;
    return Objects.equals(this.status, autenticarRsType.status) &&
        Objects.equals(this.autenticacion, autenticarRsType.autenticacion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, autenticacion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutenticarRsType {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    autenticacion: ").append(toIndentedString(autenticacion)).append("\n");
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

