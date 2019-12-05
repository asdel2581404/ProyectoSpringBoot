package com.banco.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.banco.Entity.EsquemasDirecciones;
import com.banco.Servicios.EsquemasDireccionesService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("esquemas")

public class EsquemasDireccionesApi {
	
	@Autowired
	private EsquemasDireccionesService esquemasService;
	
	@GetMapping("")	
	public List<EsquemasDirecciones> ObtenerEsquemas(){
		return (List<EsquemasDirecciones>) esquemasService.getAll();
		
	}

}
