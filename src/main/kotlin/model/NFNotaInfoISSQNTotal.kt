package model

import java.time.LocalDate

class NFNotaInfoISSQNTotal : DFBase() {
  var valorTotalServicosSobNaoIncidenciaNaoTributadosICMS: Double? = null
  var baseCalculoISS: Double? = null
  var valorTotalISS: Double? = null
  var valorPISsobreServicos: Double? = null
  var valorCOFINSsobreServicos: Double? = null
  var dataPrestacaoServico: LocalDate? = null
  var valorDeducao: Double? = null
  var valorOutros: Double? = null
  var valorTotalDescontoIncondicionado: Double? = null
  var valorTotalDescontoCondicionado: Double? = null
  var valorTotalRetencaoISS: Double? = null
  var tributacao: NFNotaInfoRegimeEspecialTributacao? = null
}