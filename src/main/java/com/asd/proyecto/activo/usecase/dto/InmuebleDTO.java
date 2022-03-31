package com.asd.proyecto.activo.usecase.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class InmuebleDTO extends ActivoDTO implements Serializable {

    String tipoDeTela;

    public InmuebleDTO(){
        this.tipo = TipoActivo.INMUEBLE.getName();
    }

}
