package com.banco.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.Entity.Genero;
import com.banco.Repository.GeneroRepository;
@Service
public class GeneroServiceImpl implements GeneroService{
	
	@Autowired
	private GeneroRepository generorepository;
	
	@Override
	public List<Genero> getAll() {
		
		return  (List<Genero>) generorepository.findAll();
	}

}
