package com.asd.proyecto.activo.usecase.factory;

import com.asd.proyecto.activo.usecase.model.Activo;

public interface ActivoFactory<T extends Activo> {

    Activo builder();

}
