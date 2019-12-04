package com.banco.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.Entity.PaisesProhibidos;
import com.banco.Repository.PaisesProhibidosRepository;

@Service
public class PaisesProhibidosImpl implements PaisesProhibidosService {
	
	@Autowired
	private PaisesProhibidosRepository paisesprohibidos;
	@Override
	public boolean getById(Long Id) {
		
	PaisesProhibidos paisesprohibidosEntity	= paisesprohibidos.findById(Id).isPresent() ? paisesprohibidos.findById(Id).get():null;
	
		if(paisesprohibidosEntity != null) {
			return true;
		}else {
			
			return false;
		}
		
	}

}
