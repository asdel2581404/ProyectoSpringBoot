package com.banco.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.banco.Entity.Genero;
import com.banco.Servicios.GeneroService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("genero")
public class GeneroApi {
	
	@Autowired
	private GeneroService generoservice;
	
	@GetMapping("")
	public List<Genero> ObtenerGenero(){
		
		return generoservice.getAll();
	}

}
