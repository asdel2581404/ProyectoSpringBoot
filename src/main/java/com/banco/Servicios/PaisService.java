package com.banco.Servicios;

import java.util.List;

import com.banco.Entity.Pais;

public interface PaisService {

	public List<Pais> getAll();
	public Pais PaisPorId(Long idPais);
	
}
