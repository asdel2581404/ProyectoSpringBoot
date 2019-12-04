package com.banco.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="paisesprohibidos")

public class PaisesProhibidos {
	
	@Id
	@Column(name="idpaisesprohibidos")
	private long idpaisesprohibidos;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="motivo")
	private String motivo;
	
	@Column(name="detalle")
	private String detalle;
	
	public PaisesProhibidos() {}
	public PaisesProhibidos(long idpaisesprohibidos, String nombre, String motivo, String detalle) {
		super();
		this.idpaisesprohibidos = idpaisesprohibidos;
		this.nombre = nombre;
		this.motivo = motivo;
		this.detalle = detalle;
	}
	public long getIdpaisesprohibidos() {
		return idpaisesprohibidos;
	}
	public void setIdpaisesprohibidos(long idpaisesprohibidos) {
		this.idpaisesprohibidos = idpaisesprohibidos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
	
	
}
