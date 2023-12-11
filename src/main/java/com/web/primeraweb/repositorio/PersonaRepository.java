package com.web.primeraweb.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.primeraweb.entidad.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
    
}
