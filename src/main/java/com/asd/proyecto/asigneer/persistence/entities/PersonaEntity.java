package com.asd.proyecto.asigneer.persistence.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class PersonaEntity {

    @Id
    @GeneratedValue
    private Long id;

    String nombre;
    String cedula;
}
