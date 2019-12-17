package com.banco.Servicios;

import java.util.List;

import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

	@Override
	public List<Departamento> DepartamentosPorPais(Long idPais) {
		
		return (List<Departamento>) departamentoRepository.findByPais(idPais);
	}

	@Override
	public Departamento DepartamentoPorId(Long idDepartamento) {
		
		return departamentoRepository.findById(idDepartamento).isPresent() ? departamentoRepository.findById(idDepartamento).get():null;
	}
	
	

	


	



	

	
	

	
	
}
