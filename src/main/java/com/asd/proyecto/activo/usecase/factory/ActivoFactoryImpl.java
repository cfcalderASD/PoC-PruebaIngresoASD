package com.asd.proyecto.activo.usecase.factory;

import com.asd.proyecto.activo.usecase.model.Activo;
import org.springframework.stereotype.Component;

@Component
public class ActivoFactoryImpl implements ActivoFactory<Activo>{

    @Override
    public Activo builder() {
        return new Activo();
    }
}
