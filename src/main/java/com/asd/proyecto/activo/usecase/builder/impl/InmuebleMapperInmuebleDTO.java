package com.asd.proyecto.activo.usecase.builder.impl;

import com.asd.proyecto.activo.usecase.builder.ActivoMapperDTO;
import com.asd.proyecto.activo.usecase.dto.ActivoDTO;
import com.asd.proyecto.activo.usecase.dto.InmuebleDTO;
import com.asd.proyecto.activo.usecase.model.Activo;
import com.asd.proyecto.activo.usecase.model.Inmueble;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InmuebleMapperInmuebleDTO extends ActivoMapperDTO<Inmueble, InmuebleDTO> {
}
