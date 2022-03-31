package com.asd.proyecto.activo.usecase.dto;

import lombok.Getter;

@Getter
public enum TipoActivo {

    ACTIVO("Activo"), INMUEBLE("Inmuebele"), MAQUINARIA("Maquinaria");

    private String name;

    TipoActivo(String name){
        this.name = name;
    }
}
