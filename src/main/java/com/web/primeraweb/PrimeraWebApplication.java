package com.web.primeraweb;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.web.primeraweb.repositorio.PersonaRepository;




@SpringBootApplication
public class PrimeraWebApplication  {
	
	@Autowired
	public PersonaRepository personaRepository;

	public static void main(String[] args) {SpringApplication.run(PrimeraWebApplication.class, args);
		/*System.out.println("Hola mundo");
		Persona persona = new Persona();
		persona.setId(1L);
		persona.setNombre("Héctor FD");
		persona.setEdad(28);*/
    /* }*/
	
/* 
	@Override
	public void run(String... args) throws Exception {
		personaRepository.save(new Persona(1L,"HectorFD",28));
		personaRepository.save(new Persona(2L,"Robert",22));
		personaRepository.save(new Persona(3L,"Jhon",20));
		personaRepository.save(new Persona(4L,"Aria",21));
		personaRepository.save(new Persona(5L,"Eliza",29));

		System.out.println("numero de personas guardadas" + personaRepository.count());

		List <Persona> personas = personaRepository.findAll();
		personas.forEach(p ->  System.out.println("Nombre Persona: "+p.getNombre()));
*/
	}
}


