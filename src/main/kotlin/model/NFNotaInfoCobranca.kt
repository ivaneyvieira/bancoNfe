package model

class NFNotaInfoCobranca : DFBase() {
  var fatura: NFNotaInfoFatura? = null
  var parcelas: List<NFNotaInfoParcela>? = null
}