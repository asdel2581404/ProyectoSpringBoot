package com.banco.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="esquemasdirecciones")

public class EsquemasDirecciones {
	
	@Id
	@Column(name="idesquemas")
	private long idesquemas;
	
	@Column(name="nombre")
	private String nombre;
	
	public EsquemasDirecciones() {}
	public EsquemasDirecciones(long idesquemas, String nombre) {
		super();
		this.idesquemas = idesquemas;
		this.nombre = nombre;
	}
	public long getIdesquemas() {
		return idesquemas;
	}
	public void setIdesquemas(long idesquemas) {
		this.idesquemas = idesquemas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
