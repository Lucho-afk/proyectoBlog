package com.sistema.sistemaGenerico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.sistemaGenerico.dto.PublicacionDTO;
import com.sistema.sistemaGenerico.models.PublicacionModel;
import com.sistema.sistemaGenerico.repository.PublicacionRepository;

@Service
public class PublicacionServiceImpl implements PublicacionService {

	@Autowired
	private PublicacionRepository publicacionRepository;

	@Override
	public PublicacionDTO crearPublicacion(PublicacionDTO publicacionDTO) {
		PublicacionModel publicacionModel = new PublicacionModel();
		publicacionModel.setTitulo(publicacionDTO.getTitulo());
		publicacionModel.setDescripcion(publicacionDTO.getDescripcion());
		publicacionModel.setContenido(publicacionDTO.getContenido());

		PublicacionModel nuevaPublicacion = publicacionRepository.save(publicacionModel);

		PublicacionDTO publicacionRespuesta = new PublicacionDTO();
		publicacionRespuesta.setId(nuevaPublicacion.getId());
		publicacionRespuesta.setTitulo(nuevaPublicacion.getTitulo());
		publicacionRespuesta.setDescripcion(nuevaPublicacion.getDescripcion());
		publicacionRespuesta.setContenido(nuevaPublicacion.getContenido());

		return publicacionRespuesta;
	}

}
