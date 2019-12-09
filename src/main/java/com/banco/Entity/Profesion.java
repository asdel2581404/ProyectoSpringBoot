package com.banco.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="profesion")
public class Profesion {

	@Id
	@Column(name="idprofesion")
	private Long idProfesion;
	
	@Column(name="nombre")
	private String nombre;
	
	public Profesion() {
		
	}
	

	public Profesion(Long idProfesion, String nombre) {
		super();
		this.idProfesion = idProfesion;
		this.nombre = nombre;
	}

	public Long getIdProfesion() {
		return idProfesion;
	}

	public void setIdProfesion(Long idProfesion) {
		this.idProfesion = idProfesion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
	
	
}
