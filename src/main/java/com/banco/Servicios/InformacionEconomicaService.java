package com.banco.Servicios;

import com.banco.Entity.InformacionEconomica;

public interface InformacionEconomicaService {

	
	
	public InformacionEconomica IngrasarInformacionEconomica(InformacionEconomica informacionEconomica);
	public InformacionEconomica ObtenerInformacionEconomicaPorCedula(Long Cedula);
	
	
}
