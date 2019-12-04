package com.banco.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ocupacion")
public class Ocupacion {
	
	@Id
	@Column(name ="idocupacion")
	private long idocupacion;
	
	@Column(name = "nombre")
	private String nombre;

	
	public Ocupacion() {}
	
	public Ocupacion(long idocupacion, String nombre) {
		super();
		this.idocupacion = idocupacion;
		this.nombre = nombre;
	}

	public long getIdocupacion() {
		return idocupacion;
	}

	public void setIdocupacion(long idocupacion) {
		this.idocupacion = idocupacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
