package com.bezkoder.spring.webflux.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.spring.webflux.model.Usuario;

@Repository
public interface UsuarioRepository extends R2dbcRepository<Usuario, Integer>{
    
}
