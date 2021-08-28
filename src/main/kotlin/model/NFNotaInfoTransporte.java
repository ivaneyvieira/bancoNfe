package model;

import java.util.List;

public class NFNotaInfoTransporte extends DFBase {
	private NFModalidadeFrete modalidadeFrete;
	private NFNotaInfoTransportador transportador;
	private NFNotaInfoRetencaoICMSTransporte icmsTransporte;
	private NFNotaInfoVeiculo veiculo;
	private List<NFNotaInfoReboque> reboques;
	private String vagao;
	private String balsa;
	private List<NFNotaInfoVolume> volumes;

	public NFModalidadeFrete getModalidadeFrete() {
		return this.modalidadeFrete;
	}

	public void setModalidadeFrete(final NFModalidadeFrete modalidadeFrete) {
		this.modalidadeFrete = modalidadeFrete;
	}

	public NFNotaInfoTransportador getTransportador() {
		return this.transportador;
	}

	public void setTransportador(final NFNotaInfoTransportador transportador) {
		this.transportador = transportador;
	}

	public NFNotaInfoRetencaoICMSTransporte getIcmsTransporte() {
		return this.icmsTransporte;
	}

	public void setIcmsTransporte(final NFNotaInfoRetencaoICMSTransporte icmsTransporte) {
		this.icmsTransporte = icmsTransporte;
	}

	public NFNotaInfoVeiculo getVeiculo() {
		return this.veiculo;
	}

	public void setVeiculo(final NFNotaInfoVeiculo veiculo) {
		this.veiculo = veiculo;
	}

	public List<NFNotaInfoReboque> getReboques() {
		return this.reboques;
	}

	public void setReboques(final List<NFNotaInfoReboque> reboques) {
		this.reboques = reboques;
	}

	public String getVagao() {
		return this.vagao;
	}

	public void setVagao(final String vagao) {
		this.vagao = vagao;
	}

	public String getBalsa() {
		return this.balsa;
	}

	public void setBalsa(final String balsa) {
		this.balsa = balsa;
	}

	public List<NFNotaInfoVolume> getVolumes() {
		return this.volumes;
	}

	public void setVolumes(final List<NFNotaInfoVolume> volumes) {
		this.volumes = volumes;
	}
}