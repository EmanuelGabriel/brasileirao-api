package br.com.emanuelgabriel.brasileiraoapi.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.emanuelgabriel.brasileiraoapi.dto.EquipeDTO;
import br.com.emanuelgabriel.brasileiraoapi.dto.EquipeModelResponse;
import br.com.emanuelgabriel.brasileiraoapi.execption.BadRequestException;
import br.com.emanuelgabriel.brasileiraoapi.execption.NotFoundException;
import br.com.emanuelgabriel.brasileiraoapi.model.Equipe;
import br.com.emanuelgabriel.brasileiraoapi.repository.EquipeRepository;

@Service
public class EquipeService {

	@Autowired
	private EquipeRepository equipeRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public Equipe buscarEquipeId(Long id) {
		return equipeRepository.findById(id)
				.orElseThrow(() -> new NotFoundException("Nenhuma equipe encontrada com o id informado: " + id));
	}
	
	public Equipe buscarEquipePorNome(String nomeEquipe) {
		return equipeRepository.findByNomeEquipe(nomeEquipe)
				.orElseThrow(() -> new NotFoundException("Nenhuma equipe encontrada com o nome informado: " + nomeEquipe));
	}

	public EquipeModelResponse listarEquipes() {
		EquipeModelResponse equipes = new EquipeModelResponse();
		equipes.setEquipes(equipeRepository.findAll());
		
		return equipes;
	}

	public Equipe inserirEquipe(EquipeDTO dto) {
		boolean exists = equipeRepository.existsByNomeEquipe(dto.getNomeEquipe());
		if (exists) {
			throw new BadRequestException("Já existe uma equipe cadastrada com o nome informado.");
		}
		Equipe equipe = modelMapper.map(dto, Equipe.class);
		return equipeRepository.save(equipe);
	}

	public void alterarEquipe(Long id, EquipeDTO dto) {
		boolean exists = equipeRepository.existsById(id);
		if (!exists) {
			throw new BadRequestException("Não foi possivel alterar a equipe: ID inexistente");
		}
		Equipe equipe = modelMapper.map(dto, Equipe.class);
		equipe.setId(id);
		equipeRepository.save(equipe);
	}

}
