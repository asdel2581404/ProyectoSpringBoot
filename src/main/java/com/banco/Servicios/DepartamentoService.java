package com.banco.Servicios;

import java.util.List;

import com.banco.Entity.Departamento;


public interface DepartamentoService  {

	public List<Departamento> getAll();
	public  List<Departamento> DepartamentosPorPais(Long idPais);
	public Departamento DepartamentoPorId(Long idDepartamento);
}
