package com.web.primeraweb.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.primeraweb.entidad.Persona;
import com.web.primeraweb.repositorio.PersonaRepository;
import com.web.primeraweb.servicio.PersonaServicio;

@Service
public class PersonaServicioImpl implements PersonaServicio {
    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> obtenerServicio() {
        return personaRepository.findAll();
    }

    @Override
    public Persona obtenerPorId(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public Persona crearPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona actualizarPersona(Long id, Persona persona) {
        Persona personabd = personaRepository.findById(id).orElse(null);
        if (personabd != null){
            personabd.setNombre(persona.getNombre());
            personabd.setEdad(persona.getEdad());
            return personaRepository.save(personabd);
        }
        return null;
    }

    @Override
    public void eliminarPersona(Long id) {
        personaRepository.deleteById(id);
    }
    
}
