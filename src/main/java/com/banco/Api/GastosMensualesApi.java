package com.banco.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.banco.Entity.GastosMensuales;
import com.banco.Servicios.GastosMensualesService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("gastosmensuales")

public class GastosMensualesApi {
	
	@Autowired
	private GastosMensualesService gastosMensualesService;
	
	@GetMapping("")
	public List<GastosMensuales> obtenerGastos() {
		
		return gastosMensualesService.getAll();		
		
	}
	

}
