package br.com.emanuelgabriel.brasileiraoapi.dto;

import java.io.Serializable;
import java.util.List;

import br.com.emanuelgabriel.brasileiraoapi.model.Equipe;

public class EquipeModelResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Equipe> equipes;

	public EquipeModelResponse() {
	}

	public List<Equipe> getEquipes() {
		return equipes;
	}

	public void setEquipes(List<Equipe> equipes) {
		this.equipes = equipes;
	}

}
