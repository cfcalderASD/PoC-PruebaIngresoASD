package com.asd.proyecto.activo.persistence.mapper.impl;

import com.asd.proyecto.activo.persistence.entities.ActivoEntity;
import com.asd.proyecto.activo.persistence.entities.InmuebleEntity;
import com.asd.proyecto.activo.persistence.mapper.ActivoMapper;
import com.asd.proyecto.activo.usecase.model.Activo;
import com.asd.proyecto.activo.usecase.model.Inmueble;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class InmuebleConverter implements ActivoMapper<InmuebleEntity, Inmueble> {


    @Override
    public Inmueble entityToModel(ActivoEntity activoEntity) {
        Inmueble inmueble = new Inmueble();
        inmueble.setId(activoEntity.getId());
        inmueble.setNombre(activoEntity.getNombre());
        inmueble.setFechaCompra(activoEntity.getFechaCompra());
        inmueble.setSerial(activoEntity.getSerial());
        inmueble.setTipo(activoEntity.getTipo());
        inmueble.setTipoDeTela( ((InmuebleEntity) activoEntity).getTipoDeTela());
        return inmueble;
    }

    @Override
    public InmuebleEntity modelToEntity(Activo activo) {
        InmuebleEntity inmuebleEntity = new InmuebleEntity();
        inmuebleEntity.setId(activo.getId());
        inmuebleEntity.setNombre(activo.getNombre());
        inmuebleEntity.setSerial(activo.getSerial());
        inmuebleEntity.setFechaCompra(activo.getFechaCompra());
        inmuebleEntity.setTipoDeTela( ((Inmueble) activo).getTipoDeTela());
        return inmuebleEntity;
    }

}
