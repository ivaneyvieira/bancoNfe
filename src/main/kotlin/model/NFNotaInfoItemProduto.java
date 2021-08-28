package model;

import java.util.List;

public class NFNotaInfoItemProduto extends DFBase {
	private String codigo;
	private String codigoDeBarras;
	private String descricao;
	private String ncm;
	private List<String> nomeclaturaValorAduaneiroEstatistica;
	private String codigoEspecificadorSituacaoTributaria;
	private NFIndicadorEscalaRelevante indicadorEscalaRelevante;
	private String cnpjFabricanteMercadoria;
	private String codigoBeneficioFiscalUF;
	private String extipi;
	private String cfop;
	private String unidadeComercial;
	private String quantidadeComercial;
	private String valorUnitario;
	private String valorTotalBruto;
	private String codigoDeBarrasTributavel;
	private String unidadeTributavel;
	private String quantidadeTributavel;
	private String valorUnitarioTributavel;
	private String valorFrete;
	private String valorSeguro;
	private String valorDesconto;
	private String valorOutrasDespesasAcessorias;
	private NFProdutoCompoeValorNota compoeValorNota;
	private List<NFNotaInfoItemProdutoDeclaracaoImportacao> declaracoesImportacao;
	private List<NFNotaInfoItemDetalheExportacao> detalhesExportacao;
	private String numeroPedidoCliente;
	private Integer numeroPedidoItemCliente;
	private String numeroControleFCI;
	private List<NFNotaInfoItemProdutoRastreabilidade> rastros;
	private NFNotaInfoItemProdutoVeiculo veiculo;
	private NFNotaInfoItemProdutoMedicamento medicamento;
	private List<NFNotaInfoItemProdutoArmamento> armamentos;
	private NFNotaInfoItemProdutoCombustivel combustivel;
	private String numeroRECOPI;
}