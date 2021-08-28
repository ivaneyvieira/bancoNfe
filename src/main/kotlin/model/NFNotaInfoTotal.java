package model;

public class NFNotaInfoTotal extends DFBase {
	private NFNotaInfoICMSTotal icmsTotal;
	private NFNotaInfoISSQNTotal issqnTotal;
	private NFNotaInfoRetencoesTributos retencoesTributos;

	public NFNotaInfoICMSTotal getIcmsTotal() {
		return this.icmsTotal;
	}

	public void setIcmsTotal(final NFNotaInfoICMSTotal icmsTotal) {
		this.icmsTotal = icmsTotal;
	}

	public NFNotaInfoISSQNTotal getIssqnTotal() {
		return this.issqnTotal;
	}

	public void setIssqnTotal(final NFNotaInfoISSQNTotal issqnTotal) {
		this.issqnTotal = issqnTotal;
	}

	public NFNotaInfoRetencoesTributos getRetencoesTributos() {
		return this.retencoesTributos;
	}

	public void setRetencoesTributos(final NFNotaInfoRetencoesTributos retencoesTributos) {
		this.retencoesTributos = retencoesTributos;
	}
}
