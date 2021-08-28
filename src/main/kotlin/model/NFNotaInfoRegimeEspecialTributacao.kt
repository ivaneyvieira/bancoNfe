package model

enum class NFNotaInfoRegimeEspecialTributacao(val codigo: String, private val descricao: String) {
  MICROEMPRESA_MUNICIPAL("1", "Microempresa municipal"),
  ESTIMATIVA("2", "Estimativa"),
  SOCIEDADE_PROFISSIONAIS("3", "Sociedade profissionais"),
  COOPERATIVA("4", "Cooperativa"),
  MICROEMPRESARIO_INDIVIDUAL_MEI("5", "Microempres\u00e1rio individual MEI"),
  MICROEMPRESARIO_E_EMPRESA_PEQUENOPORTE("6", "Microempres\u00e1rio e empresa de pequeno porte");

  override fun toString(): String {
    return "$codigo - $descricao"
  }

  companion object {
    fun valueOfCodigo(codigo: String): NFNotaInfoRegimeEspecialTributacao? {
      for (tributacao in values()) {
        if (tributacao.codigo == codigo) {
          return tributacao
        }
      }
      return null
    }
  }
}