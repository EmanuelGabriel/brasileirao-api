package br.com.emanuelgabriel.brasileiraoapi.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

public class EquipeDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotBlank
	private String nomeEquipe;

	@NotBlank
	private String urlLogoEquipe;

	public EquipeDTO() {
	}

	public String getNomeEquipe() {
		return nomeEquipe;
	}

	public void setNomeEquipe(String nomeEquipe) {
		this.nomeEquipe = nomeEquipe;
	}

	public String getUrlLogoEquipe() {
		return urlLogoEquipe;
	}

	public void setUrlLogoEquipe(String urlLogoEquipe) {
		this.urlLogoEquipe = urlLogoEquipe;
	}

}
