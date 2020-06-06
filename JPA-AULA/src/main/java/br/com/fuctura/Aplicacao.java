package br.com.fuctura;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fuctura.entidades.Dependente;
import br.com.fuctura.entidades.Funcionario;
import br.com.fuctura.entidades.Mesa;

public class Aplicacao {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Oracle");
		EntityManager em = emf.createEntityManager();
		
		//
		Funcionario fun1 = new Funcionario();
		fun1.setNome("Bob");
		
		Mesa mesa = new Mesa();
		mesa.setMarcaDaMesa("Jacauna");
		em.persist(mesa);
		
		fun1.setMesa(mesa);
		
		Dependente dep = new Dependente();
		dep.setNome("Zoom");
		em.persist(dep);
		
		List<Dependente> listaDeDependentes = new ArrayList<Dependente>();
		listaDeDependentes.add(dep);
		
		fun1.setDependentes(listaDeDependentes);
		
		em.persist(fun1);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		emf.close();
		em.close();
		
	}
}
