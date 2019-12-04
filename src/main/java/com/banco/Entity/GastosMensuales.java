package com.banco.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="gastosmensuales")

public class GastosMensuales {
	
	@Id
	@Column(name="idgastos")
	private long idgastos;
	
	@Column(name="cantidad")
	private long cantidad;
	
	
	public GastosMensuales() {}
	
	public GastosMensuales(long idgastos, long cantidad) {
		super();
		this.idgastos = idgastos;
		this.cantidad = cantidad;
	}

	public long getIdgastos() {
		return idgastos;
	}

	public void setIdgastos(long idgastos) {
		this.idgastos = idgastos;
	}

	public long getCantidad() {
		return cantidad;
	}

	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
	

}
