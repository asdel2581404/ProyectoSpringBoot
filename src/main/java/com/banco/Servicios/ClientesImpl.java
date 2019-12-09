package com.banco.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.Entity.Clientes;
import com.banco.Repository.ClientesRepository;

@Service
public class ClientesImpl implements ClientesService {

	@Autowired
	private ClientesRepository clientesRepository;

	@Override
	public List<Clientes> getAll() {

		return (List<Clientes>) clientesRepository.findAll();
	}

	
	@Override
	public Clientes insertAll(Clientes clientes) {
		
		return clientesRepository.save(clientes);
	}

}
