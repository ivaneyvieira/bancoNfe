package model

class NFNotaInfo : DFBase() {
  var identificador: String? = null
    private set
  var versao: String? = null
  var identificacao: NFNotaInfoIdentificacao? = null
  var emitente: NFNotaInfoEmitente? = null
  var avulsa: NFNotaInfoAvulsa? = null
  var destinatario: NFNotaInfoDestinatario? = null
  var retirada: NFNotaInfoLocal? = null
  var entrega: NFNotaInfoLocal? = null
  var pessoasAutorizadasDownloadNFe: List<NFPessoaAutorizadaDownloadNFe>? = null
  var itens: List<NFNotaInfoItem>? = null
  var total: NFNotaInfoTotal? = null
  var transporte: NFNotaInfoTransporte? = null
  var cobranca: NFNotaInfoCobranca? = null
  var pagamento: NFNotaInfoPagamento? = null
  var infIntermed: NFInformacaoIntermediador? = null
  var informacoesAdicionais: NFNotaInfoInformacoesAdicionais? = null
  var exportacao: NFNotaInfoExportacao? = null
  var compra: NFNotaInfoCompra? = null
  var cana: NFNotaInfoCana? = null
  var informacaoResposavelTecnico: NFNotaInfoResponsavelTecnico? = null
    private set
  val chaveAcesso: String
    get() = identificador!!.replace(IDENT, "")

  fun setIdentificador(identificador: String) {
    this.identificador = IDENT + identificador
  }

  fun setInformacaoResposavelTecnico(informacaoResposavelTecnico: NFNotaInfoResponsavelTecnico?): NFNotaInfo {
    this.informacaoResposavelTecnico = informacaoResposavelTecnico
    return this
  }

  companion object {

    const val IDENT = "NFe"
  }
}