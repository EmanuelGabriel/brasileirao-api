package br.com.emanuelgabriel.brasileiraoapi.dto;

import java.io.Serializable;
import java.util.List;

import br.com.emanuelgabriel.brasileiraoapi.model.Partida;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PartidaModelResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Partida> partidas;

	public PartidaModelResponse() {
	}

	public List<Partida> getPartidas() {
		return partidas;
	}

	public void setPartidas(List<Partida> partidas) {
		this.partidas = partidas;
	}

}
