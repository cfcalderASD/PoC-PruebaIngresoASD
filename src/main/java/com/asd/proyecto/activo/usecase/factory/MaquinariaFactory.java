package com.asd.proyecto.activo.usecase.factory;

import com.asd.proyecto.activo.usecase.model.Activo;
import com.asd.proyecto.activo.usecase.model.Inmueble;
import com.asd.proyecto.activo.usecase.model.Maquinaria;
import org.springframework.stereotype.Component;

@Component
public class MaquinariaFactory implements ActivoFactory<Maquinaria>{

    @Override
    public Activo builder() {
        return new Maquinaria();
    }
}
