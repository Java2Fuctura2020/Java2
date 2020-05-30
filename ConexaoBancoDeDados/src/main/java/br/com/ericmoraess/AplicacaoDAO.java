package br.com.ericmoraess;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import br.com.ericmoraess.dao.HospitalDAO;
import br.com.ericmoraess.dao.HospitalDAOImp;
import br.com.ericmoraess.entidade.Hospital;

public class AplicacaoDAO {
	
	public static void main(String[] args) throws IOException {
		HospitalDAO hospitalDAO = new HospitalDAOImp();
		//povoar(hospitalDAO);
		listar(hospitalDAO);
		//excluir(hospitalDAO);
	}
	
	public static void excluir(HospitalDAO dao) {
		Hospital h = new Hospital();
		h.setCapacidade(50);
		dao.delete(h);
	}
	
	public static void listar(HospitalDAO dao) {
		Set retorno = dao.getAll();
		
		Iterator<Hospital> itr = retorno.iterator();

		while(itr.hasNext()) {
			Hospital h = itr.next();
			System.out.println(h.getRazao_social());
			System.out.println(h.getCapacidade());
		}
	}
	
	public static void povoar(HospitalDAO dao) {
		Hospital hospital = new Hospital();
		hospital.setNome_fantasia("Santa Joana");
		hospital.setCapacidade(100);
		
		dao.insert(hospital);
		
		hospital = new Hospital();
		hospital.setNome_fantasia("Real Hospital Portugues");
		hospital.setCapacidade(50);
		
		dao.insert(hospital);
	}
	
}
