package model

class NFNota : DFBase() {
  var identificadorLocal: Long = 0
  var info: NFNotaInfo? = null
  var infoSuplementar: NFNotaInfoSuplementar? = null
  var assinatura: NFSignature? = null
}