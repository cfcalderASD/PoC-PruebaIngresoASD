package com.asd.proyecto.activo.usecase.builder.impl;

import com.asd.proyecto.activo.persistence.entities.InmuebleEntity;
import com.asd.proyecto.activo.usecase.builder.DtoMapper;
import com.asd.proyecto.activo.usecase.dto.ActivoDTO;
import com.asd.proyecto.activo.usecase.dto.InmuebleDTO;
import com.asd.proyecto.activo.usecase.model.Activo;
import com.asd.proyecto.activo.usecase.model.Inmueble;

public class InmuebleDtoConverter implements DtoMapper<InmuebleDTO, Inmueble> {

    @Override
    public Inmueble dtoToModel(ActivoDTO activoDTO) {
        Inmueble inmueble = new Inmueble();
        inmueble.setNombre(activoDTO.getNombre());
        inmueble.setFechaCompra(activoDTO.getFechaCompra());
        inmueble.setSerial(activoDTO.getSerial());
        inmueble.setTipo(activoDTO.getTipo());
        inmueble.setTipoDeTela( ((InmuebleDTO) activoDTO).getTipoDeTela());
        return inmueble;
    }

    @Override
    public InmuebleDTO modelToDto(Activo activo) {
        InmuebleDTO inmuebleDTO = new InmuebleDTO();
        inmuebleDTO.setNombre(activo.getNombre());
        inmuebleDTO.setSerial(activo.getSerial());
        inmuebleDTO.setTipo(activo.getTipo());
        inmuebleDTO.setFechaCompra(activo.getFechaCompra());
        inmuebleDTO.setTipoDeTela( ((Inmueble) activo).getTipoDeTela());
        return inmuebleDTO;
    }
}
