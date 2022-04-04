package com.asd.proyecto.activo.persistence.mapper;

import com.asd.proyecto.activo.persistence.entities.ActivoEntity;
import com.asd.proyecto.activo.usecase.model.Activo;

import java.util.stream.Stream;

public interface ActivoMapper<ENTITY extends ActivoEntity, MODEL extends Activo> {

    MODEL entityToModel(ActivoEntity activoEntity);
    ENTITY modelToEntity(Activo activo);
    Stream<MODEL> entityToModel(Iterable<ActivoEntity> activoEntities);
    Stream<ENTITY> modelToEntity(Iterable<Activo> activos);


}
