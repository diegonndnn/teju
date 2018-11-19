package com.diego.teju.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diego.teju.domain.Grupo;
import com.diego.teju.services.GrupoService;

@RestController
@RequestMapping(value = "/grupos")
public class GrupoResource {

	@Autowired
	private GrupoService service;

	@RequestMapping(value = "/{id}")
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Grupo obj = service.buscar(id);
		return ResponseEntity.ok(obj);
	}

}
