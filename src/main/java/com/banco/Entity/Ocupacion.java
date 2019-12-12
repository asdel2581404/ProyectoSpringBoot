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
	
	@Column(name = "nombre" )
	private String nombre;
	
	@Column(name = "prohibido")
	private boolean prohibido;

	
	public Ocupacion() {}
	
	public Ocupacion(long idocupacion, String nombre, boolean prohibido) {
		super();
		this.idocupacion = idocupacion;
		this.nombre = nombre;
		this.prohibido= prohibido;
	}

	public boolean isProhibido() {
		return prohibido;
	}

	public void setProhibido(boolean prohibido) {
		this.prohibido = prohibido;
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
