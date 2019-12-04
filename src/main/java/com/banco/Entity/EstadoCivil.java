package com.banco.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "estadocivil")
public class EstadoCivil {
	
	@Id
	@Column(name="idestadocivil")
	private long idestadocivil;
	
	@Column(name ="nombre")
	private String nombre;
	
	public EstadoCivil() {}
	
	public EstadoCivil(long idestadocivil, String nombre) {
		super();
		this.idestadocivil = idestadocivil;
		this.nombre = nombre;
	}

	public long getIdestadocivil() {
		return idestadocivil;
	}

	public void setIdestadocivil(long idestadocivil) {
		this.idestadocivil = idestadocivil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
