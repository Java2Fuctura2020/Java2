package br.com.ericmoraess;

import java.io.IOException;
import java.util.Set;

import br.com.ericmoraess.dao.HospitalDAO;
import br.com.ericmoraess.dao.HospitalDAOImp;
import br.com.ericmoraess.dao.filtro.FiltroConsultarHospitalNome;

public class AplicacaoDAO {
	
	public static void main(String[] args) throws IOException {
		HospitalDAO hospitalDAO = new HospitalDAOImp();
		
		FiltroConsultarHospitalNome filtro = new FiltroConsultarHospitalNome();
		filtro.setNmRazaoSocial("Santa Joana");
		filtro.setNumCapacidade(30);
		
		Set retorno = hospitalDAO.getAll(filtro);
		
		
		//povoar(hospitalDAO);
		//listar(hospitalDAO);
		//excluir(hospitalDAO);
	}
	/*
	public static void excluir(HospitalDAO dao) {
		VOHospital h = new VOHospital();
		h.setCapacidade(50);
		dao.delete(h);
	}
	
	public static void listar(HospitalDAO dao) {
		Set retorno = dao.getAll();
		
		Iterator<VOHospital> itr = retorno.iterator();

		while(itr.hasNext()) {
			VOHospital h = itr.next();
			System.out.println(h.getRazao_social());
			System.out.println(h.getCapacidade());
		}
	}
	
	public static void povoar(HospitalDAO dao) {
		VOHospital hospital = new VOHospital();
		hospital.setNome_fantasia("Santa Joana");
		hospital.setCapacidade(100);
		
		dao.insert(hospital);
		
		hospital = new VOHospital();
		hospital.setNome_fantasia("Real Hospital Portugues");
		hospital.setCapacidade(50);
		
		dao.insert(hospital);
	}
	*/
}
