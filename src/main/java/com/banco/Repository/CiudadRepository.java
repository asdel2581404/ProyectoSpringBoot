package com.banco.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.banco.Entity.Ciudad;


public interface CiudadRepository extends CrudRepository<Ciudad, Long> {
	@Query(" from Ciudad where iddepto= (:iddepartamento)")
	 List<Ciudad> findByDepartamento(@Param("iddepartamento")Long iddepartamento);
}
