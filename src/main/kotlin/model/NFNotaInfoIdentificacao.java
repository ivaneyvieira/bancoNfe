package model;

import org.apache.commons.lang3.StringUtils;

import java.time.ZonedDateTime;
import java.util.List;

public class NFNotaInfoIdentificacao extends DFBase {
	private DFUnidadeFederativa uf;
	private String codigoRandomico;
	private String naturezaOperacao;
	private DFModelo modelo;
	private String serie;
	private String numeroNota;
	private ZonedDateTime dataHoraEmissao;
	private ZonedDateTime dataHoraSaidaOuEntrada;
	private NFTipo tipo;
	private NFIdentificadorLocalDestinoOperacao identificadorLocalDestinoOperacao;
	private String codigoMunicipio;
	private NFTipoImpressao tipoImpressao;
	private NFTipoEmissao tipoEmissao;
	private Integer digitoVerificador;
	private DFAmbiente ambiente;
	private NFFinalidade finalidade;
	private NFOperacaoConsumidorFinal operacaoConsumidorFinal;
	private NFIndicadorPresencaComprador indicadorPresencaComprador;
	private NFIndicadorIntermediador indIntermed;
	private NFProcessoEmissor programaEmissor;
	private String versaoEmissor;
	private ZonedDateTime dataHoraContigencia;
	private String justificativaEntradaContingencia;
	private List<NFInfoReferenciada> referenciadas;

	public DFUnidadeFederativa getUf() {
		return this.uf;
	}

	public void setUf(final DFUnidadeFederativa uf) {
		this.uf = uf;
	}

	public String getCodigoRandomico() {
		return this.codigoRandomico;
	}

	public void setCodigoRandomico(final String codigoRandomico) {
		this.codigoRandomico = codigoRandomico;
	}

	public String getNaturezaOperacao() {
		return this.naturezaOperacao;
	}

	public void setNaturezaOperacao(final String naturezaOperacao) {
		this.naturezaOperacao = naturezaOperacao;
	}

	public DFModelo getModelo() {
		return this.modelo;
	}

	public void setModelo(final DFModelo modelo) {
		this.modelo = modelo;
	}

	public String getSerie() {
		return this.serie;
	}

	public void setSerie(final String serie) {
		this.serie = serie;
	}

	public String getNumeroNota() {
		return this.numeroNota;
	}

	public void setNumeroNota(final String numeroNota) {
		if (StringUtils.isNotBlank(codigoRandomico) &&
		    StringUtils.equals(numeroNota.substring(1), codigoRandomico)) {
			throw new IllegalStateException(
							String.format("N\u00FAmero da nota(%s) e c\u00F3digo(%s) n\u00E3o podem ser iguais",
											numeroNota.substring(1), codigoRandomico));
		}
		this.numeroNota = numeroNota;
	}

	public ZonedDateTime getDataHoraEmissao() {
		return this.dataHoraEmissao;
	}

	public void setDataHoraEmissao(final ZonedDateTime dataEmissao) {
		this.dataHoraEmissao = dataEmissao;
	}

	public ZonedDateTime getDataHoraSaidaOuEntrada() {
		return this.dataHoraSaidaOuEntrada;
	}

	public void setDataHoraSaidaOuEntrada(final ZonedDateTime dataHoraSaidaOuEntrada) {
		this.dataHoraSaidaOuEntrada = dataHoraSaidaOuEntrada;
	}

	public NFTipo getTipo() {
		return this.tipo;
	}

	public void setTipo(final NFTipo tipo) {
		this.tipo = tipo;
	}

	public NFIdentificadorLocalDestinoOperacao getIdentificadorLocalDestinoOperacao() {
		return this.identificadorLocalDestinoOperacao;
	}

	public void setIdentificadorLocalDestinoOperacao(
					final NFIdentificadorLocalDestinoOperacao identificadorLocalDestinoOperacao) {
		this.identificadorLocalDestinoOperacao = identificadorLocalDestinoOperacao;
	}

	public String getCodigoMunicipio() {
		return this.codigoMunicipio;
	}

	public void setCodigoMunicipio(final String codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public NFTipoImpressao getTipoImpressao() {
		return this.tipoImpressao;
	}

	public void setTipoImpressao(final NFTipoImpressao tipoImpressao) {
		this.tipoImpressao = tipoImpressao;
	}

	public NFTipoEmissao getTipoEmissao() {
		return this.tipoEmissao;
	}

	public void setTipoEmissao(final NFTipoEmissao tipoEmissao) {
		this.tipoEmissao = tipoEmissao;
	}

	public Integer getDigitoVerificador() {
		return this.digitoVerificador;
	}

	public void setDigitoVerificador(final Integer digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}

	public DFAmbiente getAmbiente() {
		return this.ambiente;
	}

	public void setAmbiente(final DFAmbiente ambiente) {
		this.ambiente = ambiente;
	}

	public NFFinalidade getFinalidade() {
		return this.finalidade;
	}

	public void setFinalidade(final NFFinalidade finalidade) {
		this.finalidade = finalidade;
	}

	public NFOperacaoConsumidorFinal getOperacaoConsumidorFinal() {
		return this.operacaoConsumidorFinal;
	}

	public void setOperacaoConsumidorFinal(final NFOperacaoConsumidorFinal operacaoConsumidorFinal) {
		this.operacaoConsumidorFinal = operacaoConsumidorFinal;
	}

	public NFIndicadorPresencaComprador getIndicadorPresencaComprador() {
		return this.indicadorPresencaComprador;
	}

	public void setIndicadorPresencaComprador(
					final NFIndicadorPresencaComprador indicadorPresencaComprador) {
		this.indicadorPresencaComprador = indicadorPresencaComprador;
	}

	public NFIndicadorIntermediador getIndIntermed() {
		return indIntermed;
	}

	public void setIndIntermed(final NFIndicadorIntermediador indIntermed) {
		this.indIntermed = indIntermed;
	}

	public NFProcessoEmissor getProgramaEmissor() {
		return this.programaEmissor;
	}

	public void setProgramaEmissor(final NFProcessoEmissor programaEmissor) {
		this.programaEmissor = programaEmissor;
	}

	public String getVersaoEmissor() {
		return this.versaoEmissor;
	}

	public void setVersaoEmissor(final String versaoEmissor) {
		this.versaoEmissor = versaoEmissor;
	}

	public ZonedDateTime getDataHoraContigencia() {
		return this.dataHoraContigencia;
	}

	public void setDataHoraContigencia(final ZonedDateTime dataHoraContigencia) {
		this.dataHoraContigencia = dataHoraContigencia;
	}

	public String getJustificativaEntradaContingencia() {
		return this.justificativaEntradaContingencia;
	}

	public void setJustificativaEntradaContingencia(final String justificativaEntradaContingencia) {
		this.justificativaEntradaContingencia = justificativaEntradaContingencia;
	}

	public List<NFInfoReferenciada> getReferenciadas() {
		return this.referenciadas;
	}

	public void setReferenciadas(final List<NFInfoReferenciada> referenciadas) {
		this.referenciadas = referenciadas;
	}
}