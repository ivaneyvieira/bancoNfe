package model

enum class NFRegimeTributario(val codigo: String, val descricao: String) {
  SIMPLES_NACIONAL("1", "Simples nacional"),
  SIMPLES_NACIONAL_EXCESSO_RECEITA("2", "Simples nacional com excesso de sublimite da receita bruta"),
  NORMAL("3", "Regime normal");

  override fun toString(): String {
    return "$codigo - $descricao"
  }

  companion object {
    fun valueOfCodigo(codigo: String): NFRegimeTributario? {
      for (regimeTributario in values()) {
        if (regimeTributario.codigo == codigo) {
          return regimeTributario
        }
      }
      return null
    }
  }
}