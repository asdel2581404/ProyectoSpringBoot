package com.banco.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.Entity.Ciudad;
import com.banco.Servicios.CiudadService;

@RestController
@RequestMapping("Ciudad")
public class CiudadApi {
	
	@Autowired
	private CiudadService ciudadService;
	
	@GetMapping("")
	public List<Ciudad> ObtenerTodasLasCiudades(){
		return ciudadService.getAll();
	}
	

	
	
}
