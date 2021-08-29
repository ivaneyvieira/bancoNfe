package model

import com.fincatto.documentofiscal.nfe400.classes.nota.NFInfoReferenciada

class NFReferencia(
  val chaveAcesso: String,
                  ) : DataBase()

fun NFInfoReferenciada.persist(): NFReferencia {
  return NFReferencia(chaveAcesso = this.chaveAcesso)
}