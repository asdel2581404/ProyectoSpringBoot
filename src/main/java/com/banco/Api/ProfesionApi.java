package com.banco.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.banco.Entity.Profesion;
import com.banco.Servicios.ProfesionService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST}) 
@RequestMapping("profesion")
public class ProfesionApi {
	
	@Autowired
	private ProfesionService profesionService;
	
	
	@GetMapping("")
	public List<Profesion> ObtenerTodasLasProfesiones(){
		return profesionService.ObtenerProfesion();
	}

}
