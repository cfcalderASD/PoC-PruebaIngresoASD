package com.asd.proyecto.activo.usecase.factory;

import com.asd.proyecto.activo.usecase.model.Activo;
import com.asd.proyecto.activo.usecase.model.Inmueble;
import org.springframework.stereotype.Component;

@Component
public class InmuebleFactory implements ActivoFactory<Inmueble>{

    @Override
    public Activo builder() {
        return new Inmueble();
    }
}
