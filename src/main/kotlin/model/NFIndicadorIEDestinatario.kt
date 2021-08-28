package model

enum class NFIndicadorIEDestinatario(val codigo: String, private val descricao: String) {
  CONTRIBUINTE_ICMS("1", "Contribuinte ICMS"),
  CONTRIBUINTE_ISENTO_INSCRICAO_CONTRIBUINTES_ICMS("2", "Contribuinte isento inscri\u00e7\u00e3o contribuintes ICMS"),
  NAO_CONTRIBUINTE("9", "N\u00e3o contribuinte");

  override fun toString(): String {
    return "$codigo - $descricao"
  }

  companion object {
    fun valueOfCodigo(codigo: String): NFIndicadorIEDestinatario? {
      for (indicador in values()) {
        if (indicador.codigo == codigo) {
          return indicador
        }
      }
      return null
    }
  }
}