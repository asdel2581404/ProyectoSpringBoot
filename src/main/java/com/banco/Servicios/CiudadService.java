package com.banco.Servicios;

import java.util.List;

import com.banco.Entity.Ciudad;


public interface CiudadService {
	
	public List<Ciudad> getAll();
	public  List<Ciudad> CiudadporPais(Long idDepartamento);
	
}
