package com.banco.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="informacioneconomica")
public class InformacionEconomica {
	
	
	@Id
	@Column(name="idinformacioneconomica")
	private Long  idInformacionEconominca;
	
	@Column(name="ocupacion")
	private String ocupacion;
	
	@Column(name="idclientes")
	private Long  idCliente;
	
	

	@Column(name="ciiu")
	private Long ciiu;
	
	@Column(name="ventasanuales")
	private Long ventasAnuales;
	
	@Column(name="totalmensuales")
	private String totalMensuales;
	
	@Column(name="paisorigeningresos")
	private String paisOrigenIngresos;
	
	@Column(name="gastosmensuales")
	private String gastosMensuales;
	
	@Column(name="activos")
	private Long activos;
	
	@Column(name="pasivos")
	private Long pasivos;
	
	@Column(name="declaranterenta")
	private boolean declaranteRenta;
	
	@Column(name="obligadotributar")
	private boolean obligadoTributar;
	
	@Column(name="paistributo")
	private String paisTributo;
	
	
	@Column(name="opemonedaextranjera")
	private boolean opeMonedaExtranjera;
	
	@Column(name="paisoperacion")
	private String paisOperacion;

	@Column(name="profesion")
	private String profesion;
	
	public InformacionEconomica() {
		
	}
	

	public InformacionEconomica(Long idInformacionEconominca, String ocupacion, Long idCliente, Long ciiu,
			Long ventasAnuales, String totalMensuales, String paisOrigenIngresos, String gastosMensuales, Long activos,
			Long pasivos, boolean declaranteRenta, boolean obligadoTributar, String paisTributo,
			boolean opeMonedaExtranjera, String paisOperacion, String profesion) {
		super();
		this.idInformacionEconominca = idInformacionEconominca;
		this.ocupacion = ocupacion;
		this.idCliente = idCliente;
		this.ciiu = ciiu;
		this.ventasAnuales = ventasAnuales;
		this.totalMensuales = totalMensuales;
		this.paisOrigenIngresos = paisOrigenIngresos;
		this.gastosMensuales = gastosMensuales;
		this.activos = activos;
		this.pasivos = pasivos;
		this.declaranteRenta = declaranteRenta;
		this.obligadoTributar = obligadoTributar;
		this.paisTributo = paisTributo;
		this.opeMonedaExtranjera = opeMonedaExtranjera;
		this.paisOperacion = paisOperacion;
		this.profesion = profesion;
	}


	public Long getIdInformacionEconominca() {
		return idInformacionEconominca;
	}

	public void setIdInformacionEconominca(Long idInformacionEconominca) {
		this.idInformacionEconominca = idInformacionEconominca;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public Long getCiiu() {
		return ciiu;
	}

	public void setCiiu(Long ciiu) {
		this.ciiu = ciiu;
	}

	public Long getVentasAnuales() {
		return ventasAnuales;
	}

	public void setVentasAnuales(Long ventasAnuales) {
		this.ventasAnuales = ventasAnuales;
	}

	public String getTotalMensuales() {
		return totalMensuales;
	}

	public void setTotalMensuales(String totalMensuales) {
		this.totalMensuales = totalMensuales;
	}

	public String getPaisOrigenIngresos() {
		return paisOrigenIngresos;
	}

	public void setPaisOrigenIngresos(String paisOrigenIngresos) {
		this.paisOrigenIngresos = paisOrigenIngresos;
	}

	public String getGastosMensuales() {
		return gastosMensuales;
	}

	public void setGastosMensuales(String gastosMensuales) {
		this.gastosMensuales = gastosMensuales;
	}

	public Long getActivos() {
		return activos;
	}

	public void setActivos(Long activos) {
		this.activos = activos;
	}

	public Long getPasivos() {
		return pasivos;
	}

	public void setPasivos(Long pasivos) {
		this.pasivos = pasivos;
	}

	public boolean isDeclaranteRenta() {
		return declaranteRenta;
	}

	public void setDeclaranteRenta(boolean declaranteRenta) {
		this.declaranteRenta = declaranteRenta;
	}

	public boolean isObligadoTributar() {
		return obligadoTributar;
	}

	public void setObligadoTributar(boolean obligadoTributar) {
		this.obligadoTributar = obligadoTributar;
	}

	public String getPaisTributo() {
		return paisTributo;
	}

	public void setPaisTributo(String paisTributo) {
		this.paisTributo = paisTributo;
	}

	public boolean isOpeMonedaExtranjera() {
		return opeMonedaExtranjera;
	}

	public void setOpeMonedaExtranjera(boolean opeMonedaExtranjera) {
		this.opeMonedaExtranjera = opeMonedaExtranjera;
	}

	public String getPaisOperacion() {
		return paisOperacion;
	}

	public void setPaisOperacion(String paisOperacion) {
		this.paisOperacion = paisOperacion;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	
	





	
	
	
}
