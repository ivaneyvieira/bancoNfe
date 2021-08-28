package model;

public class NFNotaInfoSuplementar extends DFBase {
	private String qrCode;
	private String urlConsultaChaveAcesso;

	public String getQrCode() {
		return this.qrCode;
	}

	public void setQrCode(final String qrCode) {
		this.qrCode = qrCode;
	}

	public String getUrlConsultaChaveAcesso() {
		return this.urlConsultaChaveAcesso;
	}

	public void setUrlConsultaChaveAcesso(final String urlConsultaChaveAcesso) {
		this.urlConsultaChaveAcesso = urlConsultaChaveAcesso;
	}
}