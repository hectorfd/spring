package com.web.primeraweb.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TPERSONA")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {
    @Id
    private Long id;
    private String nombre;
    private int edad;
}
