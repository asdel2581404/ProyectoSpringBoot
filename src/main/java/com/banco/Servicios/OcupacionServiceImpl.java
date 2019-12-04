package com.banco.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.Entity.Ocupacion;
import com.banco.Repository.OcupacionRepository;

@Service
public class OcupacionServiceImpl implements OcupacionService{
	
	@Autowired 
	private OcupacionRepository ocupacionrepository;

	@Override
	public List<Ocupacion> getAll() {
		
		return (List<Ocupacion>) ocupacionrepository.findAll();
	}

}
