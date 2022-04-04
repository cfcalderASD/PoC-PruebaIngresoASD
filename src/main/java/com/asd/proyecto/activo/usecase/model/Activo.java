package com.asd.proyecto.activo.usecase.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Activo {

    Long id;
    String nombre;
    String serial;
    LocalDate fechaCompra;
    String tipo;

}
