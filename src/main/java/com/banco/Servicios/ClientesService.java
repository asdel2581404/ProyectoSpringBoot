package com.banco.Servicios;

import java.util.List;

import com.banco.Entity.Clientes;

public interface ClientesService {
	
	public List<Clientes> getAll();
	public Clientes insertAll(Clientes clientes);
	

}
