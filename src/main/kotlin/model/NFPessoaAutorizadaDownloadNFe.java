package model;

public class NFPessoaAutorizadaDownloadNFe extends DFBase {
	private String cnpj;
	private String cpf;

	public void setCnpj(final String cnpj) {
		if (this.cpf != null) {
			throw new IllegalStateException("Nao deve setar CNPJ se CPF esteja setado");
		}
		this.cnpj = cnpj;
	}

	public void setCpf(final String cpf) {
		if (this.cnpj != null) {
			throw new IllegalStateException("Nao deve setar CPF se CNPJ esteja setado");
		}
		this.cpf = cpf;
	}
}