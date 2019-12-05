package com.banco.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="paises")
public class Pais {
	
	@Id
	@Column(name="idpaises")
	private Long idPaises;
	
	@Column(name="nombre")
	private String nombre;



	public Pais(Long idPaises, String nombre) {
		super();
		this.idPaises = idPaises;
		this.nombre = nombre;
	}
	public Pais() {}

	public Long getIdPaises() {
		return idPaises;
	}

	public void setIdPaises(Long idPaises) {
		this.idPaises = idPaises;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
