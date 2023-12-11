package com.web.primeraweb.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TPERSONA")
public class Persona {
    @Id
    private Long id;
    private String nombre;
    private int edad;
}
