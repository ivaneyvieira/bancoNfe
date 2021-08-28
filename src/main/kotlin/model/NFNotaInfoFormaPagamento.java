package model;

import java.math.BigDecimal;

public class NFNotaInfoFormaPagamento extends DFBase {
	private NFIndicadorFormaPagamento indicadorFormaPagamento;
	private NFMeioPagamento meioPagamento;
	private String descricaoMeioPagamento;
	private BigDecimal valorPagamento;
	private NFNotaInfoCartao cartao;

	public NFNotaInfoCartao getCartao() {
		return this.cartao;
	}

	public NFNotaInfoFormaPagamento setCartao(final NFNotaInfoCartao cartao) {
		this.cartao = cartao;
		return this;
	}

	public NFIndicadorFormaPagamento getIndicadorFormaPagamento() {
		return this.indicadorFormaPagamento;
	}

	public NFNotaInfoFormaPagamento setIndicadorFormaPagamento(
					final NFIndicadorFormaPagamento indicadorFormaPagamento) {
		this.indicadorFormaPagamento = indicadorFormaPagamento;
		return this;
	}

	public NFMeioPagamento getMeioPagamento() {
		return this.meioPagamento;
	}

	public NFNotaInfoFormaPagamento setMeioPagamento(final NFMeioPagamento meioPagamento) {
		this.meioPagamento = meioPagamento;
		return this;
	}

	public BigDecimal getValorPagamento() {
		return this.valorPagamento;
	}

	public void setValorPagamento(final BigDecimal valorPagamento) {
		this.valorPagamento = valorPagamento;
	}

	public String getDescricaoMeioPagamento() {
		return descricaoMeioPagamento;
	}

	public void setDescricaoMeioPagamento(String descricaoMeioPagamento) {
		this.descricaoMeioPagamento = descricaoMeioPagamento;
	}
}
