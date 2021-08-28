package model

class NFNotaInfoEmitente : DFBase() {
  var cnpj: String? = null
  var cpf: String? = null
  var razaoSocial: String? = null
  var nomeFantasia: String? = null
  var endereco: NFEndereco? = null
  var inscricaoEstadual: String? = null
  var inscricaoEstadualSubstituicaoTributaria: String? = null
  var inscricaoMunicipal: String? = null
  var classificacaoNacionalAtividadesEconomicas: String? = null
  var regimeTributario: NFRegimeTributario? = null
}