package com.banco.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.Entity.EsquemasDirecciones;
import com.banco.Repository.EsquemasDireccionesRepository;

@Service
public class EsquemasDireccionesImpl implements EsquemasDireccionesService {

	@Autowired
	private EsquemasDireccionesRepository esquemaRepository;
	
	@Override
	public List<EsquemasDirecciones> getAll() {
	
		return (List<EsquemasDirecciones>) esquemaRepository.findAll();
	}

}
