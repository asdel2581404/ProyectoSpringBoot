package com.banco.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.Entity.Profesion;
import com.banco.Repository.ProfesionRepository;

@Service
public class ProfesionServiceImpl implements ProfesionService{

	@Autowired
	private ProfesionRepository profesionRepository;
	
	@Override
	public List<Profesion> ObtenerProfesion() {
		
		return (List<Profesion>)profesionRepository.findAll() ;
	}

}
