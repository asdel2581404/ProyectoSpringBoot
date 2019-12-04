package com.banco.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.Entity.EstadoCivil;
import com.banco.Repository.EstadoCivilRepository;

@Service
public class EstadoCivilImpl implements EstadoCivilService{
	
	@Autowired 
	private EstadoCivilRepository estadocivilrepository;
	
	@Override
	public List<EstadoCivil> getAll() {
		
		return (List<EstadoCivil>) estadocivilrepository.findAll();
	}

}
