package model;

public class NFNotaInfoResponsavelTecnico extends DFBase {
	private String cnpj;
	private String contatoNome;
	private String email;
	private String telefone;
	private String idCSRT;
	private String hashCSRT;

	public String getCnpj() {
		return cnpj;
	}

	public NFNotaInfoResponsavelTecnico setCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public String getContatoNome() {
		return contatoNome;
	}

	public NFNotaInfoResponsavelTecnico setContatoNome(String contatoNome) {
		this.contatoNome = contatoNome;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public NFNotaInfoResponsavelTecnico setEmail(String email) {
		this.email = email;
		return this;
	}

	public String getTelefone() {
		return telefone;
	}

	public NFNotaInfoResponsavelTecnico setTelefone(String telefone) {
		this.telefone = telefone;
		return this;
	}

	public String getIdCSRT() {
		return idCSRT;
	}

	public void setIdCSRT(String idCSRT) {
		this.idCSRT = idCSRT;
	}

	public String getHashCSRT() {
		return hashCSRT;
	}

	public void setHashCSRT(String hashCSRT) {
		this.hashCSRT = hashCSRT;
	}
}
