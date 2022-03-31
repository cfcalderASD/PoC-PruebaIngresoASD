package com.asd.proyecto.activo.usecase.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Data
public class Activo {

    Long id;
    String nombre;
    String serial;
    LocalDate fechaCompra;

}
