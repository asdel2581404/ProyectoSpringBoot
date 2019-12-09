package com.banco.Servicios;

import com.banco.Entity.InformacionDomicilio;

public interface InformacionDomicilioService {
	
	public InformacionDomicilio getById(Long cedula);
	public InformacionDomicilio InsertAll(InformacionDomicilio infoDomicilio);

}
