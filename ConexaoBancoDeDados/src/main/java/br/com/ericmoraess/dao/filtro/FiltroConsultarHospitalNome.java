package br.com.ericmoraess.dao.filtro;

import br.com.ericmoraess.entidade.VOHospital;

public class FiltroConsultarHospitalNome {
	public static final String COL_NmFantasia = VOHospital.ATR_Nm_Fantasia;
	public static final String COL_NumCapacidade = VOHospital.ATR_Nu_Capacidade;

	private String nmRazaoSocial;
	private int numCapacidade;

	private boolean isRazaoSocialAlterado;
	private boolean isNumCapacidadeAlterado;
	
	
	public String getNmRazaoSocial() {
		return nmRazaoSocial;
	}

	public boolean isRazaoSocialAlterado() {
		return isRazaoSocialAlterado;
	}

	public void setNmRazaoSocial(String nmRazaoSocial) {
		this.nmRazaoSocial = nmRazaoSocial;
		this.isRazaoSocialAlterado = true;
	}

	public void setRazaoSocialAlterado(boolean isRazaoSocialAlterado) {
		this.isRazaoSocialAlterado = isRazaoSocialAlterado;
	}


	public int getNumCapacidade() {
		return numCapacidade;
	}

	public void setNumCapacidade(int numCapacidade) {
		this.numCapacidade = numCapacidade;
		this.isNumCapacidadeAlterado = true;
	}

	public boolean isNumCapacidadeAlterado() {
		return isNumCapacidadeAlterado;
	}

	public void setNumCapacidadeAlterado(boolean isNumCapacidadeAlterado) {
		this.isNumCapacidadeAlterado = isNumCapacidadeAlterado;
	}

}
