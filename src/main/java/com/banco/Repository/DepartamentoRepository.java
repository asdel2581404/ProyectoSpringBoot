package com.banco.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.banco.Entity.Departamento;


public interface DepartamentoRepository extends CrudRepository<Departamento,Long> {
	 @Query(" from Departamento where idpais= (:idpais)")
	 List<Departamento> findByPais(@Param("idpais")Long idpais);
}
