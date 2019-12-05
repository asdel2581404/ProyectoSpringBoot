package com.banco.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.Entity.GastosMensuales;
import com.banco.Repository.GastosMensualesRepository;

@Service
public class GastosMensualesImpl implements GastosMensualesService {
	
	@Autowired
	private GastosMensualesRepository gastosMensualesRepository;
	
	@Override
	public List<GastosMensuales> getAll() {
	
		return (List<GastosMensuales>) gastosMensualesRepository.findAll();
	}

}
