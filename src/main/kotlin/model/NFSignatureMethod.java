package model;

import java.io.Serializable;

public class NFSignatureMethod implements Serializable {
	private String algorithm;

	public String getAlgorithm() {
		return this.algorithm;
	}

	public void setAlgorithm(final String algorithm) {
		this.algorithm = algorithm;
	}
}

