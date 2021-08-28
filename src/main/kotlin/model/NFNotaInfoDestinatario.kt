package model

import org.apache.commons.lang3.StringUtils

class NFNotaInfoDestinatario : DFBase() {
  var cnpj: String? = null
  var cpf: String? = null
  var idEstrangeiro: String? = null
  var razaoSocial: String? = null
  var endereco: NFEndereco? = null
  var indicadorIEDestinatario: NFIndicadorIEDestinatario? = null
  var inscricaoEstadual: String? = null
  var inscricaoSuframa: String? = null
  var inscricaoMunicipal: String? = null
  var email: String? = null
  val cpfj: String?
    get() {
      if (StringUtils.isNotBlank(cpf)) {
        return cpf
      }
      else if (StringUtils.isNotBlank(cnpj)) {
        return cnpj
      }
      return idEstrangeiro
    }
}