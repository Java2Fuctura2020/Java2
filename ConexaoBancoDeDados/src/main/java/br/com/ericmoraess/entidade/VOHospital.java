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
	
	private String nomeFantasia;
	private boolean isNomeFantasiaAlterado;
	private String numCNPJ;
	private boolean isNumCNPJAlterado;
	private Date dtAbertura;
	private boolean isDtAberturaAlterado;
	private String nmRazaoSocial;
	private boolean isNmRazaoSocialAlterado;
	private int numCapacidade;
	private boolean isNumCapacidadeAlterado;
	/*
	public void setNuProcPrimProtocolo(String pNuProcPrimProtocolo)
			throws ExcecaoValorNuloNaoPermitido, ExcecaoCampoInvalido, ExcecaoParametroInvalido {
			if (pNuProcPrimProtocolo == null) {
				throw new ExcecaoValorNuloNaoPermitido(this.DS_ENTIDADE, this.DS_ATR_NuProcPrimProtocolo, "Erro construindo VO");
			}
			this.aNuProcPrimProtocolo = NumeroProtocolo.fromString(pNuProcPrimProtocolo);
			this.aNuProcPrimProtocoloAlterado = true;
		}
	*/
	
	public VOHospital() {
		
	}

}
