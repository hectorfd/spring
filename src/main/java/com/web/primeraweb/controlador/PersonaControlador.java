package com.web.primeraweb.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.web.primeraweb.entidad.Persona;
import com.web.primeraweb.servicio.PersonaServicio;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/personas")
public class PersonaControlador {
    
    @Autowired
    private PersonaServicio personaServicio;
    //!para listar
    @GetMapping
    public String listarPersonas(Model model){
        List<Persona> personas = personaServicio.obtenerServicio();
        model.addAttribute("listaPersonas",personas);
        return "listar";
    }
    //!para agregar
    @GetMapping("/nueva")
    public String mostrarFormularioNuevaPersona(Model model){
        model.addAttribute("persona", new Persona());
        return "formulario"; 
    }
    @PostMapping("/nueva")
    public String guardarNuevaPersona(@ModelAttribute Persona persona){
        personaServicio.crearPersona(persona);
        return "redirect:/personas";
    }
    //!para editar
    //?pathvariable a partir de una variable obtener datos 
    //?Model Atribute pasa los datos al formulario
    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarPersona(@PathVariable Long id,@ModelAttribute Persona persona, Model model){
        model.addAttribute("persona", persona);
        return "formulario"; 
    }
    //!para actualizar persona
    @PostMapping("/editar/{id}")
    public String actualizarPersona(@PathVariable Long id, @ModelAttribute Persona persona){
        personaServicio.actualizarPersona(id, persona);
        return "redirect:/personas";
    }
    //!Para eliminar
    @GetMapping("/eliminar/{id}")
    public String eliminarPersona(@PathVariable Long id){
        personaServicio.eliminarPersona(id);
        return "redirect:/personas";
    }
}
