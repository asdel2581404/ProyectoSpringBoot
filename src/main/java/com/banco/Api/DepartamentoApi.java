package com.banco.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.banco.Entity.Departamento;
import com.banco.Servicios.DepartamentoService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST}) 
@RequestMapping("Departamento")
public class DepartamentoApi {
	
	@Autowired
	private DepartamentoService departamentoService;

	@GetMapping("")
	public List<Departamento> ObtenerTodosLosDepartamentos(){
		
		return departamentoService.getAll();
	}
	
	@GetMapping("/{idPais}")
	public List<Departamento> ObtenerDepartamentosPorPais(@PathVariable Long idPais){
		
		return departamentoService.DepartamentosPorPais(idPais);
	}

	
	
	
}
