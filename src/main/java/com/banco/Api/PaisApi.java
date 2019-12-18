package com.banco.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.banco.Entity.Pais;
import com.banco.Servicios.PaisService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST}) 
@RequestMapping("Paises")
public class PaisApi {
	
	@Autowired
	private PaisService paisService;
	
	@GetMapping("")
	public List<Pais> ObtenerTodosLosPaises(){
		
		return paisService.getAll();
	}
	
	@GetMapping("PorId/{idPais}")
	public Pais ObtenerPaisesporId(@PathVariable Long idPais) {
		
		return paisService.PaisPorId(idPais);
	}
	
	
	

}
