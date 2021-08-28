package model

import java.math.BigDecimal
import java.time.LocalDate

class NFNotaInfoAvulsa : DFBase() {
  var cnpj: String? = null
  var orgaoEmitente: String? = null
  var matriculaAgente: String? = null
  var nomeAgente: String? = null
  var fone: String? = null
  var uf: String? = null
  var numeroDocumentoArrecadacaoReceita: String? = null
  var dataEmissaoDocumentoArrecadacao: LocalDate? = null
  var valorTotalConstanteDocumentoArrecadacaoReceita: BigDecimal? = null
  var reparticaoFiscalEmitente: String? = null
  var dataPagamentoDocumentoArrecadacao: LocalDate? = null
}