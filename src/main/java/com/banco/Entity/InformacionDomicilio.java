package com.banco.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="informaciondomicilio")

public class InformacionDomicilio {
	
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="idinfodomicilio")
	private long idinfodomicilio;
	
	@Column(name="nomenclatura")
	private String nomenclatura;
	
	@Column(name="numeroinicial")
	private String numeroinicial;
	
	@Column(name="numerosecundario")
	private String numerosecundario;
	
	@Column(name="idciudad")
	private long idciudad;
	
	@Column(name="idclientes")
	private long idclientes;
	
	public InformacionDomicilio() {}
	
	public InformacionDomicilio(long idinfodomicilio, String nomenclatura, String numeroinicial,
			String numerosecundario, long idciudad, long idclientes) {
		super();
		this.idinfodomicilio = idinfodomicilio;
		this.nomenclatura = nomenclatura;
		this.numeroinicial = numeroinicial;
		this.numerosecundario = numerosecundario;
		this.idciudad = idciudad;
		this.idclientes = idclientes;
	}

	public long getIdinfodomicilio() {
		return idinfodomicilio;
	}

	public void setIdinfodomicilio(long idinfodomicilio) {
		this.idinfodomicilio = idinfodomicilio;
	}

	public String getNomenclatura() {
		return nomenclatura;
	}

	public void setNomenclatura(String nomenclatura) {
		this.nomenclatura = nomenclatura;
	}

	public String getNumeroinicial() {
		return numeroinicial;
	}

	public void setNumeroinicial(String numeroinicial) {
		this.numeroinicial = numeroinicial;
	}

	public String getNumerosecundario() {
		return numerosecundario;
	}

	public void setNumerosecundario(String numerosecundario) {
		this.numerosecundario = numerosecundario;
	}

	public long getIdciudad() {
		return idciudad;
	}

	public void setIdciudad(long idciudad) {
		this.idciudad = idciudad;
	}

	public long getIdclientes() {
		return idclientes;
	}

	public void setIdclientes(long idclientes) {
		this.idclientes = idclientes;
	}
	
	
	
	
	


}
