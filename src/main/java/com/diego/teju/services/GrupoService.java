package com.diego.teju.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diego.teju.domain.Grupo;
import com.diego.teju.repositories.GrupoRepository;
import com.diego.teju.services.exceptions.ObjectNotFoundException;

@Service
public class GrupoService {

	@Autowired
	private GrupoRepository repo;
	
	public Grupo buscar(Integer id) {
		Optional<Grupo> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: "+ id + ", Tipo: " + Grupo.class.getName()));
	}
	
}
