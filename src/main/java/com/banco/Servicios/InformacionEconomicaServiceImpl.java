package com.banco.Servicios;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.banco.Entity.InformacionEconomica;
import com.banco.Repository.InformacionEconomicaRepository;


@Service
public class InformacionEconomicaServiceImpl implements InformacionEconomicaService{

	@Autowired 
	private InformacionEconomicaRepository informacionEconomicaRepository;
	


	@Override
	public InformacionEconomica IngrasarInformacionEconomica(InformacionEconomica informacionEconomica) {
		
		return informacionEconomicaRepository.save(informacionEconomica);
	}



	@Override
	public InformacionEconomica ObtenerInformacionEconomicaPorCedula(Long Cedula) {
		
		return informacionEconomicaRepository.findByCliente(Cedula) ;
	}
	

}
