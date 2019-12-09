package com.banco.Servicios;

import com.banco.Entity.InformacionDomicilio;

public interface InformacionDomicilioService {
	
	public InformacionDomicilio getById(Long Id);
	public InformacionDomicilio InsertAll(InformacionDomicilio infoDomicilio);

}
