package com.asd.proyecto.activo.persistence.mapper.impl;

import com.asd.proyecto.activo.persistence.entities.ActivoEntity;
import com.asd.proyecto.activo.persistence.mapper.ActivoMapper;
import com.asd.proyecto.activo.usecase.model.Activo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ActivoEntityMapperActivo extends ActivoMapper<ActivoEntity, Activo> {

}
