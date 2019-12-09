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
	public InformacionDomicilio getById(Long cedula) {
	
		return  infoRepository.findByCliente(cedula);
		
	}

	@Override
	public InformacionDomicilio InsertAll(InformacionDomicilio infoDomicilio) {
		
		return infoRepository.save(infoDomicilio);
	}

}
