package model;

public class NFSignature extends DFBase {
	private String id;
	private NFSignedInfo signedInfo;
	private String signatureValue;
	private NFKeyInfo keyInfo;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public NFSignedInfo getSignedInfo() {
		return this.signedInfo;
	}

	public void setSignedInfo(final NFSignedInfo signedInfo) {
		this.signedInfo = signedInfo;
	}

	public String getSignatureValue() {
		return this.signatureValue;
	}

	public void setSignatureValue(final String signatureValue) {
		this.signatureValue = signatureValue;
	}

	public NFKeyInfo getKeyInfo() {
		return this.keyInfo;
	}

	public void setKeyInfo(final NFKeyInfo keyInfo) {
		this.keyInfo = keyInfo;
	}
}