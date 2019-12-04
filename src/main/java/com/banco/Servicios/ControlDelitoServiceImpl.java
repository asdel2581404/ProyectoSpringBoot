package com.banco.Servicios;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.Entity.ControlDelito;
import com.banco.Repository.ControlDelitoRepository;

@Service
public class ControlDelitoServiceImpl implements ControlDelitoService {
	
	@Autowired
	private ControlDelitoRepository controldelitorepository;
	
	@Override
	public boolean getById(Long Id) {
		
		ControlDelito controldelito=controldelitorepository.findById(Id).isPresent() ?  controldelitorepository.findById(Id).get():null;
		 
		if(controldelito != null) {
			
			return true;
			
		}else {
			
			return false;
		}
		 
		
	}

}
