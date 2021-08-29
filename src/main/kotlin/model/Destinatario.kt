package model

import com.fincatto.documentofiscal.nfe400.classes.nota.NFNotaInfoDestinatario
import com.fincatto.documentofiscal.nfe400.classes.nota.NFNotaInfoEmitente

class Destinatario(
  val cnpj: String?,
  val cpf: String?,
  val razaoSocial: String?,
  val logradouro: String?,
  val numero: String?,
  val complemento: String?,
  val bairro: String?,
  val codigoMunicipio: String?,
  val descricaoMunicipio: String?,
  val uf: String?,
  val cep: String?,
  val codigoPais: Int?,
  val descricaoPais: String?,
  val telefone: String?,
  val inscricaoEstadual: String?,
              )

fun NFNotaInfoDestinatario.persist(): Destinatario {
  return Destinatario(
    cnpj = this.cnpj,
    cpf = this.cpf,
    razaoSocial = this.razaoSocial,
    logradouro = this.endereco.logradouro,
    numero = this.endereco.numero,
    complemento = this.endereco.complemento,
    bairro = this.endereco.bairro,
    codigoMunicipio = this.endereco.codigoMunicipio,
    descricaoMunicipio = this.endereco.descricaoMunicipio,
    uf = this.endereco.uf,
    cep = this.endereco.cep,
    codigoPais = this.endereco.codigoPais.codigo,
    descricaoPais = this.endereco.descricaoPais,
    telefone = this.endereco.telefone,
    inscricaoEstadual = this.inscricaoEstadual,
                 )
}