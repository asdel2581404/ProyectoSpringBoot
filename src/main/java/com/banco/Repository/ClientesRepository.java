package com.banco.Repository;

import org.springframework.data.repository.CrudRepository;

import com.banco.Entity.Clientes;

public interface ClientesRepository extends CrudRepository<Clientes, Long> {

}
