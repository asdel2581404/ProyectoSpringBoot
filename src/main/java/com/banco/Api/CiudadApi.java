package com.banco.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.banco.Entity.Ciudad;
import com.banco.Servicios.CiudadService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST}) 
@RequestMapping("Ciudad")
public class CiudadApi {
	
	@Autowired
	private CiudadService ciudadService;
	
	@GetMapping("")
	public List<Ciudad> ObtenerTodasLasCiudades(){
		return ciudadService.getAll();
	}
	
	@GetMapping("/{idDepartamento}")
	public List<Ciudad> ObtenerCiudadporPais(@PathVariable Long idDepartamento){
		
		return ciudadService.CiudadporPais(idDepartamento);
	}


	@GetMapping("PorId/{idCiudad}")
	public Ciudad ObtenerCiudadporId(@PathVariable Long idCiudad){
		
		return ciudadService.CiudadPorId(idCiudad);
	}
	
}
