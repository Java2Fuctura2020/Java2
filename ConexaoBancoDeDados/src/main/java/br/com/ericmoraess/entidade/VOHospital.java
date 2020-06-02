package br.com.ericmoraess.entidade;

import java.sql.Date;

/*
 * Data Transfer Object
 * Objeto de transferencia de dados
 */
public class VOHospital extends Entidade {
	
	public static final String NM_ATR_Nm_Fantasia = "nome_fantasia";
	public static final String NM_ATR_Nu_CNPJ = "cnpj";
	public static final String NM_ATR_Dt_abertura = "data_abertura";
	public static final String NM_ATR_Nm_Razao_Social = "razao_social";
	public static final String NM_ATR_Nu_Capacidade = "capacidade";
	public static final String NM_TABELA = "HOSPITAL";
	
	private String nomeFantasia;
	private String numCNPJ;
	private Date dtAbertura;
	private String nmRazaoSocial;
	private int numCapacidade;
	
	public VOHospital() {
		
	}

}
