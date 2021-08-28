package model;

import java.math.BigInteger;

public class NFNotaInfoItemImpostoIPI extends DFBase {
	private String cnpjProdutor;
	private String codigoSelo;
	private BigInteger quantidadeSelo;
	private String codigoEnquadramento;
	private NFNotaInfoItemImpostoIPITributado tributado;
	private NFNotaInfoItemImpostoIPINaoTributado naoTributado;
}