package model;

import java.math.BigInteger;
import java.util.List;

public class NFNotaInfoVolume extends DFBase {
	private BigInteger quantidadeVolumesTransportados;
	private String especieVolumesTransportados;
	private String marca;
	private String numeracaoVolumesTransportados;
	private String pesoLiquido;
	private String pesoBruto;
	private List<NFNotaInfoLacre> lacres;
}