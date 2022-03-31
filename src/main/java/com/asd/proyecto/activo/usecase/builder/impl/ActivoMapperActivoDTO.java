package com.asd.proyecto.activo.usecase.builder.impl;

import com.asd.proyecto.activo.usecase.builder.ActivoMapperDTO;
import com.asd.proyecto.activo.usecase.dto.ActivoDTO;
import com.asd.proyecto.activo.usecase.model.Activo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingInheritanceStrategy;

@Mapper(componentModel = "spring" /*, mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG*/)
public interface ActivoMapperActivoDTO extends ActivoMapperDTO<Activo, ActivoDTO> {
}
