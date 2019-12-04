package com.banco.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.Servicios.PaisesProhibidosService;

import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST}) 
@RequestMapping("paisesProhibidos")
public class PaisesProhibidosApi {
	
	@Autowired
	private PaisesProhibidosService prohibidosServices;
	
	@GetMapping("/{Id}")
	public boolean obtenerPaisProhibido(@PathVariable Long Id) {
		return prohibidosServices.getById(Id);
		
	}
	
	

}
