package model;

public class NFInfoProdutorRuralReferenciada extends DFBase {
	private DFUnidadeFederativa ufEmitente;
	private String anoMesEmissao;
	private String cnpjEmitente;
	private String cpfEmitente;
	private String ieEmitente;
	private String modeloDocumentoFiscal;
	private Integer serieDocumentoFiscal;
	private Integer numeroDocumentoFiscal;

	public DFUnidadeFederativa getUfEmitente() {
		return this.ufEmitente;
	}

	public void setUfEmitente(final DFUnidadeFederativa ufEmitente) {
		this.ufEmitente = ufEmitente;
	}

	public String getAnoMesEmissao() {
		return this.anoMesEmissao;
	}

	public void setAnoMesEmissao(final String anoMesEmissao) {
		this.anoMesEmissao = anoMesEmissao;
	}

	public String getCnpjEmitente() {
		return this.cnpjEmitente;
	}

	public void setCnpjEmitente(final String cnpjEmitente) {
		if (this.cpfEmitente != null) {
			throw new IllegalStateException("Nao pode setar CNPJ pois CPF ja esta setado");
		}
		this.cnpjEmitente = cnpjEmitente;
	}

	public String getCpfEmitente() {
		return this.cpfEmitente;
	}

	public void setCpfEmitente(final String cpfEmitente) {
		if (this.cnpjEmitente != null) {
			throw new IllegalStateException("Nao pode setar CPF pois CNPJ ja esta setado");
		}
		this.cpfEmitente = cpfEmitente;
	}

	public String getIeEmitente() {
		return this.ieEmitente;
	}

	public void setIeEmitente(final String ieEmitente) {
		this.ieEmitente = ieEmitente;
	}

	public String getModeloDocumentoFiscal() {
		return this.modeloDocumentoFiscal;
	}

	public void setModeloDocumentoFiscal(final String modeloDocumentoFiscal) {
		this.modeloDocumentoFiscal = modeloDocumentoFiscal;
	}

	public Integer getSerieDocumentoFiscal() {
		return this.serieDocumentoFiscal;
	}

	public void setSerieDocumentoFiscal(final Integer serieDocumentoFiscal) {
		this.serieDocumentoFiscal = serieDocumentoFiscal;
	}

	public Integer getNumeroDocumentoFiscal() {
		return this.numeroDocumentoFiscal;
	}

	/**
	 * Número do Documento Fiscal - 1 – 999999999
	 */
	public void setNumeroDocumentoFiscal(final Integer numeroDocumentoFiscal) {
		this.numeroDocumentoFiscal = numeroDocumentoFiscal;
	}
}