package com.asd.proyecto.activo.persistence.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "activo")
@DiscriminatorColumn(name="tipo_activo")
@DiscriminatorValue("generico")
@Inheritance
//@Inheritance(strategy = InheritanceType.JOINED)
public class ActivoEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    Long id;

    String nombre;
    String serial;
    LocalDate fechaCompra;

}
