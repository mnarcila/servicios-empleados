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
 * RolRsType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-15T18:38:52.094Z")

public class RolRsType   {
  public RolRsType(StatusType status, Integer idRol) {
		this.status = status;
		this.idRol = idRol;
	}
  
  public RolRsType() {	
	}

@JsonProperty("status")
  private StatusType status = null;

  @JsonProperty("idRol")
  private Integer idRol = null;

  public RolRsType status(StatusType status) {
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

  public RolRsType idRol(Integer idRol) {
    this.idRol = idRol;
    return this;
  }

  /**
   * idRol
   * @return idRol
  **/
  @ApiModelProperty(value = "idRol")


  public Integer getIdRol() {
    return idRol;
  }

  public void setIdRol(Integer idRol) {
    this.idRol = idRol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RolRsType rolRsType = (RolRsType) o;
    return Objects.equals(this.status, rolRsType.status) &&
        Objects.equals(this.idRol, rolRsType.idRol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, idRol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RolRsType {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    idRol: ").append(toIndentedString(idRol)).append("\n");
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

