package com.banco.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ciudad")
public class Ciudad {
	
	@Id
	@Column(name="idciudad")
	private Long idCiudad;
	
	@Column(name="nombre")
	private String nombre;
	
	
	@Column(name="iddepto")
	private Long idDepartamento;
	
	
	

}
