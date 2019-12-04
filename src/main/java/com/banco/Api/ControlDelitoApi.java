package com.banco.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.Entity.ControlDelito;
import com.banco.Servicios.ControlDelitoService;

@RestController
@RequestMapping("control")
public class ControlDelitoApi {
	
	
	@Autowired
	private ControlDelitoService controldelitoservice;
	
	@GetMapping("/{Id}")	
	public boolean ObtenerControlId (@PathVariable Long Id ) {
		return controldelitoservice.getById(Id);
	}
}
