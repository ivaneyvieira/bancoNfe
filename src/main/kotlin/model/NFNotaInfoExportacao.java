package model;

public class NFNotaInfoExportacao extends DFBase {
	private String ufEmbarqueProduto;
	private String localEmbarqueProdutos;
	private String localDespachoProdutos;

	public String getLocalDespachoProdutos() {
		return this.localDespachoProdutos;
	}

	public void setLocalDespachoProdutos(final String localDespachoProdutos) {
		this.localDespachoProdutos = localDespachoProdutos;
	}

	public String getLocalEmbarqueProdutos() {
		return this.localEmbarqueProdutos;
	}

	public void setLocalEmbarqueProdutos(final String localEmbarqueProdutos) {
		this.localEmbarqueProdutos = localEmbarqueProdutos;
	}

	public String getUfEmbarqueProduto() {
		return this.ufEmbarqueProduto;
	}

	public void setUfEmbarqueProduto(final DFUnidadeFederativa ufEmbarqueProduto) {
		this.ufEmbarqueProduto = ufEmbarqueProduto.getCodigo();
	}
}