package com.banco.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.banco.Entity.InformacionDomicilio;

public interface InformacionDomicilioRepository extends CrudRepository<InformacionDomicilio,Long> {
	
	@Query(" from InformacionDomicilio where idclientes= (:idCliente)")
	InformacionDomicilio findByCliente(@Param("idCliente")Long idCliente);
	
}
