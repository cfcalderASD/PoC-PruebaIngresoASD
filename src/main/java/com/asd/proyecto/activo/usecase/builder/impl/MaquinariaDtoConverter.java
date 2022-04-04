package com.asd.proyecto.activo.usecase.builder.impl;

import com.asd.proyecto.activo.persistence.entities.MaquinariaEntity;
import com.asd.proyecto.activo.usecase.builder.DtoMapper;
import com.asd.proyecto.activo.usecase.dto.ActivoDTO;
import com.asd.proyecto.activo.usecase.dto.MaquinariaDTO;
import com.asd.proyecto.activo.usecase.model.Activo;
import com.asd.proyecto.activo.usecase.model.Maquinaria;

public class MaquinariaDtoConverter implements DtoMapper<MaquinariaDTO, Maquinaria> {

    @Override
    public Maquinaria dtoToModel(ActivoDTO activoDTO) {
        Maquinaria maquinaria = new Maquinaria();
        maquinaria.setNombre(activoDTO.getNombre());
        maquinaria.setFechaCompra(activoDTO.getFechaCompra());
        maquinaria.setSerial(activoDTO.getSerial());
        maquinaria.setTipo(activoDTO.getTipo());
        maquinaria.setFabricante( ((MaquinariaDTO) activoDTO).getFabricante());
        return maquinaria;
    }

    @Override
    public MaquinariaDTO modelToDto(Activo activo) {
        MaquinariaDTO maquinariaDTO = new MaquinariaDTO();
        maquinariaDTO.setNombre(activo.getNombre());
        maquinariaDTO.setSerial(activo.getSerial());
        maquinariaDTO.setFechaCompra(activo.getFechaCompra());
        maquinariaDTO.setTipo(activo.getTipo());
        maquinariaDTO.setFabricante( ((Maquinaria) activo).getFabricante());
        return maquinariaDTO;
    }
}
