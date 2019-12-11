package com.banco.Repository;

import org.springframework.data.repository.CrudRepository;

import com.banco.Entity.ControlDelito;

public interface ControlDelitoRepository extends CrudRepository<ControlDelito, Long> {
	
	public ControlDelito findBycedula(Long cedula);
	
}
