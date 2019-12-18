package com.banco.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.Entity.Pais;
import com.banco.Repository.PaisRepository;

@Service
public class PaisServiceImpl implements PaisService {

    @Autowired
    private PaisRepository paisRepository;
	
	
	@Override
	public List<Pais> getAll() {
		
		return (List<Pais>)paisRepository.findAll();
	}


	@Override
	public Pais PaisPorId(Long idPais) {
		
		return paisRepository.findById(idPais).isPresent() ? paisRepository.findById(idPais).get():null;
	}

}
