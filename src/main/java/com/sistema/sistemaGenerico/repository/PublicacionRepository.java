package com.sistema.sistemaGenerico.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.sistema.sistemaGenerico.models.PublicacionModel;

public interface PublicacionRepository extends JpaRepository<PublicacionModel, Long>{

}
