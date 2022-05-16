package com.sistema.sistemaGenerico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistema.sistemaGenerico.dto.PublicacionDTO;
import com.sistema.sistemaGenerico.service.PublicacionService;

@RestController
@RequestMapping("/api/publicaciones")
public class PublicacionController {

	@Autowired
	private PublicacionService publicacionService;
	
	@PostMapping
	public ResponseEntity<PublicacionDTO> savePub(@RequestBody PublicacionDTO publicacionDTO ){
		return new ResponseEntity<>(publicacionService.crearPublicacion(publicacionDTO), HttpStatus.CREATED);
	}
	
	
	
	
}
