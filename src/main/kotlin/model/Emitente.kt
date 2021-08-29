package model

import com.fincatto.documentofiscal.nfe400.classes.nota.NFNotaInfoEmitente

class Emitente(
  val cnpj: String?,
  val cpf: String?,
  val razaoSocial: String?,
  val nomeFantasia: String?,
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
  val inscricaoEstadualSubstituicaoTributaria: String?,
  val inscricaoMunicipal: String?,
  val classificacaoNacionalAtividadesEconomicas: String?,
  val regimeTributario: String?,
              )

fun NFNotaInfoEmitente.persist(): Emitente {
  return Emitente(
    cnpj = this.cnpj,
    cpf = this.cpf,
    razaoSocial = this.razaoSocial,
    nomeFantasia = this.nomeFantasia,
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
    inscricaoEstadualSubstituicaoTributaria = this.inscricaoEstadualSubstituicaoTributaria,
    inscricaoMunicipal = this.inscricaoMunicipal,
    classificacaoNacionalAtividadesEconomicas = this.classificacaoNacionalAtividadesEconomicas,
    regimeTributario = this.regimeTributario.codigo,
                 )
}