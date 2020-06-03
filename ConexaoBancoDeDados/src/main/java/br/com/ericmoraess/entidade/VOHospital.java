package br.com.ericmoraess.entidade;

import java.sql.Date;

/*
 * Data Transfer Object
 * Objeto de transferencia de dados
 */
public class VOHospital extends Entidade {
	
	public static final String ATR_Nm_Fantasia = "nome_fantasia";
	public static final String ATR_Nu_CNPJ = "cnpj";
	public static final String ATR_Dt_abertura = "data_abertura";
	public static final String ATR_Nm_Razao_Social = "razao_social";
	public static final String ATR_Nu_Capacidade = "capacidade";
	public static final String NM_TABELA = "HOSPITAL";
	
	private String nomeFantasia;
	private String numCNPJ;
	private Date dtAbertura;
	private String nmRazaoSocial;
	private int numCapacidade;
	
	public VOHospital() {
		
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public String getNumCNPJ() {
		return numCNPJ;
	}

	public Date getDtAbertura() {
		return dtAbertura;
	}

	public String getNmRazaoSocial() {
		return nmRazaoSocial;
	}

	public int getNumCapacidade() {
		return numCapacidade;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public void setNumCNPJ(String numCNPJ) {
		this.numCNPJ = numCNPJ;
	}

	public void setDtAbertura(Date dtAbertura) {
		this.dtAbertura = dtAbertura;
	}

	public void setNmRazaoSocial(String nmRazaoSocial) {
		this.nmRazaoSocial = nmRazaoSocial;
	}

	public void setNumCapacidade(int numCapacidade) {
		this.numCapacidade = numCapacidade;
	}

}
