package model;

import java.time.LocalDate;
import java.util.List;

public class NFNotaInfoItemProdutoDeclaracaoImportacao extends DFBase {
	private String numeroRegistro;
	private LocalDate dataRegistro;
	private String localDesembaraco;
	private String ufDesembaraco;
	private LocalDate dataDesembaraco;
	private NFViaTransporteInternacional transporteInternacional;
	private String valorAFRMM;
	private NFFormaImportacaoIntermediacao formaImportacaoIntermediacao;
	private String cnpj;
	private String ufTerceiro;
	private String codigoExportador;
	private List<NFNotaInfoItemProdutoDeclaracaoImportacaoAdicao> adicoes;
}