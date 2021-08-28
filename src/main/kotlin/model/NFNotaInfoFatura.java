package model;

import java.math.BigDecimal;

public class NFNotaInfoFatura extends DFBase {
	private String numeroFatura;
	private BigDecimal valorOriginalFatura;
	private BigDecimal valorDesconto;
	private BigDecimal valorLiquidoFatura;

	public BigDecimal getValorOriginalFatura() {
		return this.valorOriginalFatura;
	}

	public void setValorOriginalFatura(final BigDecimal valorOriginalFatura) {
		this.valorOriginalFatura = valorOriginalFatura;
	}

	public BigDecimal getValorDesconto() {
		return this.valorDesconto;
	}

	public void setValorDesconto(final BigDecimal valorDesconto) {
		//this.valorDesconto = BigDecimalParser.tamanho15Com2CasasDecimais(valorDesconto, "Valor Desconto Fatura");
		this.valorDesconto = valorDesconto;
	}

	public BigDecimal getValorLiquidoFatura() {
		return this.valorLiquidoFatura;
	}

	public void setValorLiquidoFatura(final BigDecimal valorLiquidoFatura) {
		this.valorLiquidoFatura = valorLiquidoFatura;
	}

	public String getNumeroFatura() {
		return this.numeroFatura;
	}

	public void setNumeroFatura(final String numeroFatura) {
		this.numeroFatura = numeroFatura;
	}
}