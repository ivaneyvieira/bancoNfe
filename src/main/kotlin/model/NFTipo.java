package model;

public enum NFTipo {
	ENTRADA("0", "Entrada"), SAIDA("1", "Sa\u00edda");
	private final String codigo;
	private final String descricao;

	NFTipo(final String codigo, final String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public static NFTipo valueOfCodigo(final String codigo) {
		for (final NFTipo tipo : NFTipo.values()) {
			if (tipo.getCodigo().equals(codigo)) {
				return tipo;
			}
		}
		return null;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public String toString() {
		return codigo + " - " + descricao;
	}
}