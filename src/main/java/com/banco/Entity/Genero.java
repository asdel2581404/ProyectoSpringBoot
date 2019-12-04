package com.banco.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="genero")
public class Genero {
	
	@Id
	@Column(name="idgenero")
	private long idgenero;
	
	@Column(name= "nombre")
	private String nombre;
	
	public Genero() {}
	
	public Genero(long idgenero, String nombre) {
		super();
		this.idgenero = idgenero;
		this.nombre = nombre;
	}

	public long getIdgenero() {
		return idgenero;
	}

	public void setIdgenero(long idgenero) {
		this.idgenero = idgenero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
