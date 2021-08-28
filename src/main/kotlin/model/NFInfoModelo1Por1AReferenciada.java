package model;

public class NFInfoModelo1Por1AReferenciada extends DFBase {
	private DFUnidadeFederativa uf;
	private String anoMesEmissaoNFe;
	private String cnpj;
	private String modeloDocumentoFiscal;
	private Integer serie;
	private String numeroDocumentoFiscal;

	public DFUnidadeFederativa getUf() {
		return this.uf;
	}

	public void setUf(final DFUnidadeFederativa uf) {
		this.uf = uf;
	}

	public String getAnoMesEmissaoNFe() {
		return this.anoMesEmissaoNFe;
	}

	public void setAnoMesEmissaoNFe(final String anoMesEmissaoNFe) {
		this.anoMesEmissaoNFe = anoMesEmissaoNFe;
	}

	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(final String cnpj) {
		this.cnpj = cnpj;
	}

	public String getModeloDocumentoFiscal() {
		return this.modeloDocumentoFiscal;
	}

	public void setModeloDocumentoFiscal(final String modeloDocumentoFiscal) {
		this.modeloDocumentoFiscal = modeloDocumentoFiscal;
	}

	public Integer getSerie() {
		return this.serie;
	}

	public void setSerie(final Integer serie) {
		this.serie = serie;
	}

	public String getNumeroDocumentoFiscal() {
		return this.numeroDocumentoFiscal;
	}

	public void setNumeroDocumentoFiscal(final String numeroDocumentoFiscal) {
		this.numeroDocumentoFiscal = numeroDocumentoFiscal;
	}
}