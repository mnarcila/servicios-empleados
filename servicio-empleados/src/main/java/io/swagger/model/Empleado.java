package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Empleado de la plataforma Kallsonys
 */
@ApiModel(description = "Empleado de la plataforma Kallsonys")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-15T18:38:52.094Z")

@Entity
@DynamicUpdate
@Table(name = "SEGEMPLEADO")
public class Empleado {

	@Column(name = "idempleado")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty("idEmpleado")
	private Integer idEmpleado = null;

	@Column(name = "nombre")
	@JsonProperty("nombre")
	private String nombre = null;

	@Column(name = "apellido")
	@JsonProperty("apellido")
	private String apellido = null;

	@Column(name = "usuario")
	@JsonProperty("usuario")
	private String usuario = null;

	@Column(name = "clave")
	@JsonProperty("clave")
	private String clave = null;

	@Column(name = "estado")
	@JsonProperty("estado")
	private String estado = null;

	public Empleado idEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
		return this;
	}

	/**
	 * Get idEmpleado
	 * 
	 * @return idEmpleado
	 **/
	@ApiModelProperty(value = "")

	public Integer getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public Empleado nombre(String nombre) {
		this.nombre = nombre;
		return this;
	}

	/**
	 * Get nombre
	 * 
	 * @return nombre
	 **/
	@ApiModelProperty(value = "")

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Empleado apellido(String apellido) {
		this.apellido = apellido;
		return this;
	}

	/**
	 * Get apellido
	 * 
	 * @return apellido
	 **/
	@ApiModelProperty(value = "")

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Empleado usuario(String usuario) {
		this.usuario = usuario;
		return this;
	}

	/**
	 * Get usuario
	 * 
	 * @return usuario
	 **/
	@ApiModelProperty(value = "")

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Empleado clave(String clave) {
		this.clave = clave;
		return this;
	}

	/**
	 * Get clave
	 * 
	 * @return clave
	 **/
	@ApiModelProperty(value = "")

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Empleado estado(String estado) {
		this.estado = estado;
		return this;
	}

	/**
	 * Get estado
	 * 
	 * @return estado
	 **/
	@ApiModelProperty(value = "")

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Empleado empleado = (Empleado) o;
		return Objects.equals(this.idEmpleado, empleado.idEmpleado) && Objects.equals(this.nombre, empleado.nombre)
				&& Objects.equals(this.apellido, empleado.apellido) && Objects.equals(this.usuario, empleado.usuario)
				&& Objects.equals(this.clave, empleado.clave) && Objects.equals(this.estado, empleado.estado);
	}

	@Override
	public int hashCode() {
		return Objects.hash(idEmpleado, nombre, apellido, usuario, clave, estado);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Empleado {\n");

		sb.append("    idEmpleado: ").append(toIndentedString(idEmpleado)).append("\n");
		sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
		sb.append("    apellido: ").append(toIndentedString(apellido)).append("\n");
		sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
		sb.append("    clave: ").append(toIndentedString(clave)).append("\n");
		sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
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
