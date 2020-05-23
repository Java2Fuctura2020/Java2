package br.com.ericmoraess.entidade;

import java.sql.Date;

/*
 * Data Transfer Object
 * Objeto de transferencia de dados
 */
public class Hospital {
	
	
	private String nome_fantasia;
	private String cnpj;
	private Date data_abertura;
	private String razao_social;
	private int capacidade;

	public Hospital(String nome_fantasia, String cnpj, Date data_abertura, String razao_social, int capacidade) {
		super();
		this.nome_fantasia = nome_fantasia;
		this.cnpj = cnpj;
		this.data_abertura = data_abertura;
		this.razao_social = razao_social;
		this.capacidade = capacidade;
	}
	
	public Hospital() {
		// TODO Auto-generated constructor stub
	}
	
	public String getNome_fantasia() {
		return nome_fantasia;
	}

	public void setNome_fantasia(String nome_fantasia) {
		this.nome_fantasia = nome_fantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Date getData_abertura() {
		return data_abertura;
	}

	public void setData_abertura(Date data_abertura) {
		this.data_abertura = data_abertura;
	}

	public String getRazao_social() {
		return razao_social;
	}

	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

}
