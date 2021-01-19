package br.com.emanuelgabriel.brasileiraoapi.dto;

import java.io.Serializable;

import br.com.emanuelgabriel.brasileiraoapi.util.StatusPartida;

public class PartidaGoogleDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private StatusPartida statusPartida;
	private String tempoPartida;

	private String nomeEquipeCasa;
	private String urlLogoEquipeCasa;
	private Integer placarEquipeCasa;
	private String golsEquipeCasa;
	private Integer placarEstendidoEquipeCasa;

	private String nomeEquipeVisitante;
	private String urlLogoEquipeVisitante;
	private Integer placarEquipeVisitante;
	private String golsEquipeVisitante;
	private Integer placarEstendidoEquipeVisitante;

	public PartidaGoogleDTO() {
	}

	public PartidaGoogleDTO(StatusPartida statusPartida, String tempoPartida, String nomeEquipeCasa,
			String urlLogoEquipeCasa, Integer placarEquipeCasa, String golsEquipeCasa,
			Integer placarEstendidoEquipeCasa, String nomeEquipeVisitante, String urlLogoEquipeVisitante,
			Integer placarEquipeVisitante, String golsEquipeVisitante, Integer placarEstendidoEquipeVisitante) {
		this.statusPartida = statusPartida;
		this.tempoPartida = tempoPartida;
		this.nomeEquipeCasa = nomeEquipeCasa;
		this.urlLogoEquipeCasa = urlLogoEquipeCasa;
		this.placarEquipeCasa = placarEquipeCasa;
		this.golsEquipeCasa = golsEquipeCasa;
		this.placarEstendidoEquipeCasa = placarEstendidoEquipeCasa;
		this.nomeEquipeVisitante = nomeEquipeVisitante;
		this.urlLogoEquipeVisitante = urlLogoEquipeVisitante;
		this.placarEquipeVisitante = placarEquipeVisitante;
		this.golsEquipeVisitante = golsEquipeVisitante;
		this.placarEstendidoEquipeVisitante = placarEstendidoEquipeVisitante;
	}

	public StatusPartida getStatusPartida() {
		return statusPartida;
	}

	public void setStatusPartida(StatusPartida statusPartida) {
		this.statusPartida = statusPartida;
	}

	public String getTempoPartida() {
		return tempoPartida;
	}

	public void setTempoPartida(String tempoPartida) {
		this.tempoPartida = tempoPartida;
	}

	public String getNomeEquipeCasa() {
		return nomeEquipeCasa;
	}

	public void setNomeEquipeCasa(String nomeEquipeCasa) {
		this.nomeEquipeCasa = nomeEquipeCasa;
	}

	public String getUrlLogoEquipeCasa() {
		return urlLogoEquipeCasa;
	}

	public void setUrlLogoEquipeCasa(String urlLogoEquipeCasa) {
		this.urlLogoEquipeCasa = urlLogoEquipeCasa;
	}

	public Integer getPlacarEquipeCasa() {
		return placarEquipeCasa;
	}

	public void setPlacarEquipeCasa(Integer placarEquipeCasa) {
		this.placarEquipeCasa = placarEquipeCasa;
	}

	public String getGolsEquipeCasa() {
		return golsEquipeCasa;
	}

	public void setGolsEquipeCasa(String golsEquipeCasa) {
		this.golsEquipeCasa = golsEquipeCasa;
	}

	public Integer getPlacarEstendidoEquipeCasa() {
		return placarEstendidoEquipeCasa;
	}

	public void setPlacarEstendidoEquipeCasa(Integer placarEstendidoEquipeCasa) {
		this.placarEstendidoEquipeCasa = placarEstendidoEquipeCasa;
	}

	public String getNomeEquipeVisitante() {
		return nomeEquipeVisitante;
	}

	public void setNomeEquipeVisitante(String nomeEquipeVisitante) {
		this.nomeEquipeVisitante = nomeEquipeVisitante;
	}

	public String getUrlLogoEquipeVisitante() {
		return urlLogoEquipeVisitante;
	}

	public void setUrlLogoEquipeVisitante(String urlLogoEquipeVisitante) {
		this.urlLogoEquipeVisitante = urlLogoEquipeVisitante;
	}

	public Integer getPlacarEquipeVisitante() {
		return placarEquipeVisitante;
	}

	public void setPlacarEquipeVisitante(Integer placarEquipeVisitante) {
		this.placarEquipeVisitante = placarEquipeVisitante;
	}

	public String getGolsEquipeVisitante() {
		return golsEquipeVisitante;
	}

	public void setGolsEquipeVisitante(String golsEquipeVisitante) {
		this.golsEquipeVisitante = golsEquipeVisitante;
	}

	public Integer getPlacarEstendidoEquipeVisitante() {
		return placarEstendidoEquipeVisitante;
	}

	public void setPlacarEstendidoEquipeVisitante(Integer placarEstendidoEquipeVisitante) {
		this.placarEstendidoEquipeVisitante = placarEstendidoEquipeVisitante;
	}

	@Override
	public String toString() {
		return "PartidaGoogleDTO [statusPartida=" + statusPartida + ", tempoPartida=" + tempoPartida
				+ ", nomeEquipeCasa=" + nomeEquipeCasa + ", urlLogoEquipeCasa=" + urlLogoEquipeCasa
				+ ", placarEquipeCasa=" + placarEquipeCasa + ", golsEquipeCasa=" + golsEquipeCasa
				+ ", placarEstendidoEquipeCasa=" + placarEstendidoEquipeCasa + ", nomeEquipeVisitante="
				+ nomeEquipeVisitante + ", urlLogoEquipeVisitante=" + urlLogoEquipeVisitante
				+ ", placarEquipeVisitante=" + placarEquipeVisitante + ", golsEquipeVisitante=" + golsEquipeVisitante
				+ ", placarEstendidoEquipeVisitante=" + placarEstendidoEquipeVisitante + "]";
	}

}
