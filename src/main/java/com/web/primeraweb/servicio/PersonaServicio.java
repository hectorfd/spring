package com.web.primeraweb.servicio;

import com.web.primeraweb.entidad.Persona;
import java.util.List;

public interface PersonaServicio {
    List<Persona> obtenerServicio();
    Persona obtenerPorId(Long id);
    Persona crearPersona(Persona persona);
    Persona actualizarPersona(Long id, Persona persona);
    void eliminarPersona(Long id);
}
