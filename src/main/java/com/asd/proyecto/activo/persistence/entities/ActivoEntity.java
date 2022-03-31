package com.asd.proyecto.activo.persistence.entities;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "activo")
@Inheritance(strategy = InheritanceType.JOINED)
public class ActivoEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    Long id;

    String nombre;
    String serial;
    LocalDate fechaCompra;


}
