package model;

import java.util.List;

public class NFNotaInfoInformacoesAdicionais extends DFBase {
	private String informacoesAdicionaisInteresseFisco;
	private String informacoesComplementaresInteresseContribuinte;
	private List<NFNotaInfoObservacao> observacoesContribuinte;
	private List<NFNotaInfoObservacao> observacoesFisco;
	private List<NFNotaInfoProcessoReferenciado> processosRefenciado;

	public String getInformacoesAdicionaisInteresseFisco() {
		return this.informacoesAdicionaisInteresseFisco;
	}

	public void setInformacoesAdicionaisInteresseFisco(
					final String informacoesAdicionaisInteresseFisco) {
		this.informacoesAdicionaisInteresseFisco = informacoesAdicionaisInteresseFisco;
	}

	public String getInformacoesComplementaresInteresseContribuinte() {
		return this.informacoesComplementaresInteresseContribuinte;
	}

	public void setInformacoesComplementaresInteresseContribuinte(
					final String informacoesComplementaresInteresseContribuinte) {
		this.informacoesComplementaresInteresseContribuinte = informacoesComplementaresInteresseContribuinte;
	}

	public List<NFNotaInfoObservacao> getObservacoesContribuinte() {
		return this.observacoesContribuinte;
	}

	public void setObservacoesContribuinte(final List<NFNotaInfoObservacao> observacoesContribuinte) {
		this.observacoesContribuinte = observacoesContribuinte;
	}

	public List<NFNotaInfoObservacao> getObservacoesFisco() {
		return this.observacoesFisco;
	}

	public void setObservacoesFisco(final List<NFNotaInfoObservacao> observacoesFisco) {
		this.observacoesFisco = observacoesFisco;
	}

	public List<NFNotaInfoProcessoReferenciado> getProcessosRefenciado() {
		return this.processosRefenciado;
	}

	public void setProcessosRefenciado(
					final List<NFNotaInfoProcessoReferenciado> processosRefenciado) {
		this.processosRefenciado = processosRefenciado;
	}
}