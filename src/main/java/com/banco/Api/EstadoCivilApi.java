package com.banco.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;


import com.banco.Entity.EstadoCivil;
import com.banco.Servicios.EstadoCivilService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("estadocivil" )
public class EstadoCivilApi {
	
	@Autowired
	private EstadoCivilService estadocivilservice;
	
	@GetMapping("")
	public List<EstadoCivil> ObtenerEstadoCivil(){
		return estadocivilservice.getAll();
	}

}
