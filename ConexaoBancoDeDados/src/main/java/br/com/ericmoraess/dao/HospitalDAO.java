package br.com.ericmoraess.dao;

import java.util.Set;

import br.com.ericmoraess.dao.filtro.FiltroConsultarHospitalNome;
import br.com.ericmoraess.entidade.VOHospital;

public interface HospitalDAO {
	public Set<VOHospital> getAll();
	public void insert(VOHospital h);
	public void update(VOHospital h);
	public void delete(VOHospital h);
	
	
	//consultas específicas
	public	Set<VOHospital>getAll(FiltroConsultarHospitalNome filtroConsultarNome);
	
}
