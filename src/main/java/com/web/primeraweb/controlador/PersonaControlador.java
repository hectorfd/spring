package com.web.primeraweb.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.web.primeraweb.entidad.Persona;
import com.web.primeraweb.servicio.PersonaServicio;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/personas")

public class PersonaControlador {
    
    @Autowired
    private PersonaServicio personaServicio;
    @GetMapping
    
    public String listarPersonas(Model model){
        List<Persona> personas = personaServicio.obtenerServicio();
        model.addAttribute("listaPersonas",personas);
        return "listar";
    }
}
