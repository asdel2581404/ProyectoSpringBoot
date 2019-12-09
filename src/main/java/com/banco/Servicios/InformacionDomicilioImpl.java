package com.banco.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.Entity.InformacionDomicilio;
import com.banco.Repository.InformacionDomicilioRepository;

@Service
public class InformacionDomicilioImpl implements InformacionDomicilioService{
		
	@Autowired
	private InformacionDomicilioRepository infoRepository;
	
	@Override
	public InformacionDomicilio getById(Long Id) {
	
		return  infoRepository.findById(Id).isPresent() ? infoRepository.findById(Id).get():null ;
		
	}

	@Override
	public InformacionDomicilio InsertAll(InformacionDomicilio infoDomicilio) {
		
		return infoRepository.save(infoDomicilio);
	}

}
