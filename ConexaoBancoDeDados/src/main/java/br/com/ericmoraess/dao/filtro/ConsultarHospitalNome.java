package br.com.ericmoraess.dao.filtro;

import java.util.Set;

import br.com.ericmoraess.entidade.VOHospital;

public class ConsultarHospitalNome {
	public static final String NM_COL_NmFantasia = VOHospital.NM_ATR_Nm_Fantasia;
	
	public static ConsultarHospitalNome instancia = new ConsultarHospitalNome();
	
	public static ConsultarHospitalNome getInstancia() {
		if(instancia == null) {
			instancia = new ConsultarHospitalNome();
		}
		return instancia;
	}
	
	
	public Set<VOHospital> consultar(FiltroConsultarHospitalNome filtro){
		
		
		return null;
	}
	
	
}
