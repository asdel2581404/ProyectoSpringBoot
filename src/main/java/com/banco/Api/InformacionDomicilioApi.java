package com.banco.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.banco.Entity.InformacionDomicilio;
import com.banco.Servicios.InformacionDomicilioService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST}) 
@RequestMapping("Infodomicilio")

public class InformacionDomicilioApi {
	
	@Autowired
	private InformacionDomicilioService infoDomicilioService;
	
	@GetMapping("/{Id}")
	public InformacionDomicilio ObtenerDomicilio(@PathVariable Long Id){
		
		return infoDomicilioService.getById(Id);
		
	}
	
	public InformacionDomicilio InsertarDomicilio(@RequestBody InformacionDomicilio informacionDomicilio) {
		
		return infoDomicilioService.InsertAll(informacionDomicilio);
		
	}
	

}
