package com.banco.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.Entity.Clientes;
import com.banco.Servicios.ClientesService;

@RestController
@RequestMapping("clientes")

public class ClientesApi {
	
	@Autowired 
	private ClientesService clientesService;
	
	@GetMapping()
	public List<Clientes> ObtenerClientes() {
		return clientesService.getAll() ;
		
	}
	
	@PostMapping("/insertarCliente")
	public 	Clientes InsertarCliente(@RequestBody Clientes clientes) {
		
		return clientesService.insertAll(clientes);
		
	}
	
	
	

}
