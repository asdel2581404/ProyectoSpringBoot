package com.banco.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.Entity.Departamento;
import com.banco.Repository.DepartamentoRepository;

@Service
public class DepartamentoServiceImpl implements DepartamentoService{

	@Autowired
	private DepartamentoRepository departamentoRepository;
	
	@Override
	public List<Departamento> getAll() {
		
		return (List<Departamento>)departamentoRepository.findAll();
	}



	

	
	

	
	
}
