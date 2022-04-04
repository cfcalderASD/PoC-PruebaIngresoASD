package com.asd.proyecto.activo.persistence.mapper.impl;

import com.asd.proyecto.activo.persistence.entities.ActivoEntity;
import com.asd.proyecto.activo.persistence.entities.InmuebleEntity;
import com.asd.proyecto.activo.persistence.entities.MaquinariaEntity;
import com.asd.proyecto.activo.persistence.mapper.ActivoMapper;
import com.asd.proyecto.activo.usecase.model.Activo;
import com.asd.proyecto.activo.usecase.model.Inmueble;
import com.asd.proyecto.activo.usecase.model.Maquinaria;

public class MaquinariaConverter implements ActivoMapper<MaquinariaEntity, Maquinaria> {

    @Override
    public Maquinaria entityToModel(ActivoEntity activoEntity) {
        Maquinaria maquinaria = new Maquinaria();
        maquinaria.setId(activoEntity.getId());
        maquinaria.setNombre(activoEntity.getNombre());
        maquinaria.setFechaCompra(activoEntity.getFechaCompra());
        maquinaria.setSerial(activoEntity.getSerial());
        maquinaria.setTipo(activoEntity.getTipo());
        maquinaria.setFabricante( ((MaquinariaEntity) activoEntity).getFabricante());
        return maquinaria;
    }

    @Override
    public MaquinariaEntity modelToEntity(Activo activo) {
        MaquinariaEntity maquinariaEntity = new MaquinariaEntity();
        maquinariaEntity.setId(activo.getId());
        maquinariaEntity.setNombre(activo.getNombre());
        maquinariaEntity.setSerial(activo.getSerial());
        maquinariaEntity.setFechaCompra(activo.getFechaCompra());
        maquinariaEntity.setFabricante( ((Maquinaria) activo).getFabricante());
        return maquinariaEntity;
    }
}
