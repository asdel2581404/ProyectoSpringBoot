package com.banco.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="clientes")

public class Clientes {
	
	@Id
	@Column(name="cedula")
	private long cedula;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="celular")
	private long celular;
	
	@Column(name="email")
	private String email;
	
	@Column(name="genero")
	private String genero;
	
	@Column(name="estadocivil")
	private String estadocivil;
	
	@Lob
	@Column(name = "imagencedula")
	private byte[] imagencedula;
	
	
	
	public Clientes() {}
	
	public Clientes(long cedula, String nombre, String apellido, long celular, String email, String genero,
			String estadocivil, byte[] imagencedula) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.celular = celular;
		this.email = email;
		this.genero = genero;
		this.estadocivil = estadocivil;
		this.imagencedula = imagencedula;
	
	}

	public long getCedula() {
		return cedula;
	}

	public void setCedula(long cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public long getCelular() {
		return celular;
	}

	public void setCelular(long celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}

	public byte[] getImagencedula() {
		return imagencedula;
	}

	public void setImagencedula(byte[] imagencedula) {
		this.imagencedula = imagencedula;
	}

	
	
	
	
	

}
