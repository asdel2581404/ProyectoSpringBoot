package com.banco.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Query;
import javax.persistence.Table;

@Entity
@Table(name="departamento")
public class Departamento {

	
	@Id
	@Column(name="iddepartamento")
	private Long idDepartamento;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="idpais")
	private Long idPais;
	

	public Departamento() {
		
	}
	public Departamento(Long idDepartamento, String nombre, Long idPais) {
		super();
		this.idDepartamento = idDepartamento;
		this.nombre = nombre;
		this.idPais = idPais;
	}

	public Long getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(Long idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getIdPais() {
		return idPais;
	}

	public void setIdPais(Long idPais) {
		this.idPais = idPais;
	}
	

	
	
	
	
	
}
