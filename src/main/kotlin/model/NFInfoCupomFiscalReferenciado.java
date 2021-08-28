package model;

public class NFInfoCupomFiscalReferenciado extends DFBase {
	private String modeloDocumentoFiscal;
	private String numeroOrdemSequencialECF;
	private String numeroContadorOrdemOperacao;

	public String getModeloDocumentoFiscal() {
		return this.modeloDocumentoFiscal;
	}

	public void setModeloDocumentoFiscal(final String modeloDocumentoFiscal) {
		this.modeloDocumentoFiscal = modeloDocumentoFiscal;
	}

	public String getNumeroContadorOrdemOperacao() {
		return this.numeroContadorOrdemOperacao;
	}

	public void setNumeroContadorOrdemOperacao(final String numeroContadorOrdemOperacao) {
		this.numeroContadorOrdemOperacao = numeroContadorOrdemOperacao;
	}

	public String getNumeroOrdemSequencialECF() {
		return this.numeroOrdemSequencialECF;
	}

	public void setNumeroOrdemSequencialECF(final String numeroOrdemSequencialECF) {
		this.numeroOrdemSequencialECF = numeroOrdemSequencialECF;
	}
}