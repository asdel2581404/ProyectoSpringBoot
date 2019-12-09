package com.banco.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.Entity.InformacionEconomica;
import com.banco.Servicios.InformacionEconomicaService;


@RestController
@RequestMapping("informacionEconomica")
public class InformacionEconomicaApi {

	@Autowired
	private InformacionEconomicaService informacionEconomicaservice;
	
	@PostMapping("")
	public InformacionEconomica ingresarEvento(@RequestBody  InformacionEconomica informacionEconomica) {
	    return informacionEconomicaservice.IngrasarInformacionEconomica(informacionEconomica);
	}
	
	@GetMapping("/{Cedula}")
	public InformacionEconomica ObtenerInformacionEconomicaPorCedula(@PathVariable Long Cedula  ) {
		
		return informacionEconomicaservice.ObtenerInformacionEconomicaPorCedula(Cedula);
	}
	
}
