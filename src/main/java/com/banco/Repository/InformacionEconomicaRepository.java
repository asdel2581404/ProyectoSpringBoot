package com.banco.Repository;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import com.banco.Entity.InformacionEconomica;

public interface InformacionEconomicaRepository extends CrudRepository<InformacionEconomica,Long> {

	@Query(" from InformacionEconomica where idCliente= (:idCliente)")
	 InformacionEconomica findByCliente(@Param("idCliente")Long idCliente);
}
