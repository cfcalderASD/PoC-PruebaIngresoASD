package com.asd.proyecto.activo.usecase.dto;

import java.io.Serializable;

public class MaquinariaDTO extends ActivoDTO implements Serializable {

    String fabricante;

    public MaquinariaDTO(){
        this.tipo = TipoActivo.MAQUINARIA.getName();
    }

}
