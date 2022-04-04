package com.asd.proyecto.activo.usecase.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class ActivoDTO implements Serializable {

    protected String nombre;
    protected String serial;
    protected LocalDate fechaCompra;
    protected String tipo;


}
