package com.banco.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.banco.Entity.Ocupacion;
import com.banco.Servicios.OcupacionService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST}) 
@RequestMapping("ocupacion")
public class OcupacionApi {
	
	@Autowired
	private OcupacionService ocupacionservice;
	
	@GetMapping("")	
	public List<Ocupacion> ObtenerOcupacion (){
		
		return ocupacionservice.getAll();
	}
	
	@GetMapping("PorId/{idOcupacion}")	
	public Ocupacion ObtenerOcupacionPorId (@PathVariable Long idOcupacion){
		
		return ocupacionservice.getById(idOcupacion);
	}
	

}
