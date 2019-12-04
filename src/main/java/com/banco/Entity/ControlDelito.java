package com.banco.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="controldelito")
public class ControlDelito {
	
	@Id
	@Column(name ="idcontrol")
	private long idcontrol;
	//HOLA
	@Column(name= "cedula")
	private long cedula;
	
	@Column(name= "delito")
	private String delito;
	
	@Column(name= "nombre")
	private String nombre;
	
	public ControlDelito() {}
	
	public ControlDelito(long idcontrol, long cedula, String delito, String nombre) {
		super();
		this.idcontrol = idcontrol;
		this.cedula = cedula;
		this.delito = delito;
		this.nombre = nombre;
	}

	public long getIdcontrol() {
		return idcontrol;
	}

	public void setIdcontrol(long idcontrol) {
		this.idcontrol = idcontrol;
	}

	public long getCedula() {
		return cedula;
	}

	public void setCedula(long cedula) {
		this.cedula = cedula;
	}

	public String getDelito() {
		return delito;
	}

	public void setDelito(String delito) {
		this.delito = delito;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	

}
