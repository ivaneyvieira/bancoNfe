package model;

import java.math.BigDecimal;
import java.util.List;

public class NFNotaInfoPagamento extends DFBase {
	private List<NFNotaInfoFormaPagamento> detalhamentoFormasPagamento;
	private BigDecimal valorTroco;

	public List<NFNotaInfoFormaPagamento> getDetalhamentoFormasPagamento() {
		return this.detalhamentoFormasPagamento;
	}

	public NFNotaInfoPagamento setDetalhamentoFormasPagamento(
					final List<NFNotaInfoFormaPagamento> detalhamentoFormasPagamento) {
		this.detalhamentoFormasPagamento = detalhamentoFormasPagamento;
		return this;
	}

	public BigDecimal getValorTroco() {
		return this.valorTroco;
	}

	public void setValorTroco(final BigDecimal valorTroco) {
		this.valorTroco = valorTroco;
	}
}