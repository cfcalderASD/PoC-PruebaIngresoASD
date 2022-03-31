package com.asd.proyecto.activo.usecase.builder.impl;

import com.asd.proyecto.activo.usecase.builder.ActivoMapperDTO;
import com.asd.proyecto.activo.usecase.dto.InmuebleDTO;
import com.asd.proyecto.activo.usecase.dto.MaquinariaDTO;
import com.asd.proyecto.activo.usecase.model.Inmueble;
import com.asd.proyecto.activo.usecase.model.Maquinaria;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MaquinariaMapperMaquinariaDTO extends ActivoMapperDTO<Maquinaria, MaquinariaDTO>{
}
