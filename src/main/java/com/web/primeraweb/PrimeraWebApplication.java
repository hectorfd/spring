package com.web.primeraweb;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.web.primeraweb.repositorio.PersonaRepository;



@ComponentScan(basePackages = "com.web.primeraweb.handler")

@SpringBootApplication
public class PrimeraWebApplication  {
	
	@Autowired
	public PersonaRepository personaRepository;

	public static void main(String[] args) {SpringApplication.run(PrimeraWebApplication.class, args);
	
	}
}


