package model

import java.math.BigDecimal
import java.util.regex.Pattern

class NFNotaInfoCana : DFBase() {
  var safra: String? = null
    private set
  var referencia: String? = null
  var fornecimentosDiario: List<NFNotaInfoCanaFornecimentoDiario>? = null
  var deducoes: List<NFNotaInfoCanaDeducao>? = null
  var quantidadeTotalMes: BigDecimal? = null
  var quantidadeTotalAnterior: BigDecimal? = null
  var quantidadeTotalGeral: BigDecimal? = null
  var valorFornecimento: BigDecimal? = null
  var valorTotalDeducao: BigDecimal? = null
  var valorLiquidoFornecimento: BigDecimal? = null
  fun setSafra(safra: String) {
    check(!(safra.length != 4 && safra.length != 9)) { "Tamanho invalido" }
    val pattern = if (safra.length == 4) Pattern.compile("[0-9]{4}")
    else Pattern.compile("[0-9]{4}/[0-9]{4}")
    val matcher = pattern.matcher(safra)
    check(matcher.find()) { "Padrao invalido" }
    this.safra = safra
  }

  companion object
}