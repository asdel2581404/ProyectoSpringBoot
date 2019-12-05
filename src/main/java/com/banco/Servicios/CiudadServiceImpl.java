package com.banco.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.Entity.Ciudad;
import com.banco.Repository.CiudadRepository;
@Service
public class CiudadServiceImpl implements CiudadService {

	
	@Autowired
	private CiudadRepository ciudadRepository;
	
	@Override
	public List<Ciudad> getAll() {
		
		return (List<Ciudad>) ciudadRepository.findAll();
	}

}
