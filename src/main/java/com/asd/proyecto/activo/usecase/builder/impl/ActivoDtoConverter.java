package com.asd.proyecto.activo.usecase.builder.impl;

import com.asd.proyecto.activo.persistence.entities.ActivoEntity;
import com.asd.proyecto.activo.usecase.builder.DtoMapper;
import com.asd.proyecto.activo.usecase.dto.ActivoDTO;
import com.asd.proyecto.activo.usecase.model.Activo;

public class ActivoDtoConverter implements DtoMapper<ActivoDTO, Activo> {
    @Override
    public Activo dtoToModel(ActivoDTO activoDTO) {
        Activo activo = new Activo();
        activo.setTipo(activoDTO.getTipo());
        activo.setId(activo.getId());
        activo.setSerial(activoDTO.getSerial());
        activo.setNombre(activoDTO.getNombre());
        activo.setFechaCompra(activoDTO.getFechaCompra());
        return activo;
    }

    @Override
    public ActivoDTO modelToDto(Activo activo) {
        ActivoDTO activoDTO = new ActivoDTO();
        activoDTO.setNombre(activo.getNombre());
        activoDTO.setSerial(activo.getSerial());
        activoDTO.setFechaCompra(activo.getFechaCompra());
        activoDTO.setTipo(activo.getTipo());
        return activoDTO;
    }
}
