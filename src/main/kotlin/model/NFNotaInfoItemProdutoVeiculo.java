package model;

public class NFNotaInfoItemProdutoVeiculo extends DFBase {
	private NFNotaInfoItemProdutoVeiculoTipoOperacao tipoOperacao;
	private String chassi;
	private String codigoCor;
	private String descricaoCor;
	private String potencia;
	private String cilindrada;
	private String pesoLiquido;
	private String pesoBruto;
	private String numeroSerie;
	private NFNotaInfoCombustivelTipo tipoCombustivel;
	private String numeroMotor;
	private String capacidadeMaximaTracao;
	private String distanciaEntreEixos;
	private Integer anoModeloFabricacao;
	private Integer anoFabricacao;
	private String tipoPintura;
	private NFNotaInfoTipoVeiculo tipoVeiculo;
	private NFNotaInfoEspecieVeiculo especieVeiculo;
	private NFNotaInfoItemProdutoVeiculoCondicaoChassi condicaoChassi;
	private NFNotaInfoItemProdutoVeiculoCondicao condicao;
	private String codigoMarcaModelo;
	private NFNotaInfoVeiculoCor corDENATRAN;
	private Integer lotacao;
	private NFNotaInfoItemProdutoVeiculoRestricao restricao;
}