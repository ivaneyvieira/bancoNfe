package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class NFNotaInfoParcela extends DFBase {
	private String numeroParcela;
	private LocalDate dataVencimento;
	private BigDecimal valorParcela;

	public BigDecimal getValorParcela() {
		return this.valorParcela;
	}

	public void setValorParcela(final BigDecimal valorParcela) {
		this.valorParcela = valorParcela;
	}

	public String getNumeroParcela() {
		return this.numeroParcela;
	}

	public void setNumeroParcela(final String numeroParcela) {
		this.numeroParcela = numeroParcela;
	}

	public LocalDate getDataVencimento() {
		return this.dataVencimento;
	}

	public void setDataVencimento(final LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
}