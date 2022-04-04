package com.asd.proyecto.activo.persistence.mapper.impl;

import com.asd.proyecto.activo.persistence.entities.ActivoEntity;
import com.asd.proyecto.activo.persistence.mapper.ActivoMapper;
import com.asd.proyecto.activo.usecase.model.Activo;

import java.util.stream.Stream;

public class ActivoConverter implements ActivoMapper<ActivoEntity, Activo> {

    @Override
    public Activo entityToModel(ActivoEntity activoEntity) {
        Activo activo = new Activo();
        activo.setId(activoEntity.getId());
        activo.setNombre(activoEntity.getNombre());
        activo.setFechaCompra(activoEntity.getFechaCompra());
        activo.setSerial(activoEntity.getSerial());
        activo.setTipo(activoEntity.getTipo());
        return activo;
    }

    @Override
    public ActivoEntity modelToEntity(Activo activo) {
        ActivoEntity activoEntity = new ActivoEntity();
        activoEntity.setId(activo.getId());
        activoEntity.setNombre(activo.getNombre());
        activoEntity.setSerial(activo.getSerial());
        activoEntity.setFechaCompra(activo.getFechaCompra());
        return activoEntity;
    }

    @Override
    public Stream<Activo> entityToModel(Iterable<ActivoEntity> activoEntities) {
        return null;
    }

    @Override
    public Stream<ActivoEntity> modelToEntity(Iterable<Activo> activos) {
        return null;
    }
}
