package model;

import java.math.BigDecimal;

public class NFImpostoDevolvido extends DFBase {
	private BigDecimal percentualDevolucao;
	private NFInformacaoImpostoDevolvido informacaoIPIDevolvido;

	public BigDecimal getPercentualDevolucao() {
		return this.percentualDevolucao;
	}

	public void setPercentualDevolucao(final BigDecimal percentualDevolucao) {
		this.percentualDevolucao = percentualDevolucao;
	}

	public NFInformacaoImpostoDevolvido getInformacaoIPIDevolvido() {
		return this.informacaoIPIDevolvido;
	}

	public void setInformacaoIPIDevolvido(final NFInformacaoImpostoDevolvido informacaoIPIDevolvido) {
		this.informacaoIPIDevolvido = informacaoIPIDevolvido;
	}
}