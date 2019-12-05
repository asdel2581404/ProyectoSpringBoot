package com.banco.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ciudad")
public class Ciudad {
	
	@Id
	@Column(name="idciudad")
	private Long idCiudad;
	
	@Column(name="nombre")
	private String nombre;
	
	
	@Column(name="iddepto")
	private Long idDepartamento;

    public Ciudad() {}
	public Ciudad(Long idCiudad, String nombre, Long idDepartamento) {
		super();
		this.idCiudad = idCiudad;
		this.nombre = nombre;
		this.idDepartamento = idDepartamento;
	}


	public Long getIdCiudad() {
		return idCiudad;
	}


	public void setIdCiudad(Long idCiudad) {
		this.idCiudad = idCiudad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Long getIdDepartamento() {
		return idDepartamento;
	}


	public void setIdDepartamento(Long idDepartamento) {
		this.idDepartamento = idDepartamento;
	}
	
	
	

}
