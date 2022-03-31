package com.asd.proyecto.activo.persistence.mapper.impl;

import com.asd.proyecto.activo.persistence.entities.MaquinariaEntity;
import com.asd.proyecto.activo.persistence.mapper.ActivoMapper;
import com.asd.proyecto.activo.usecase.model.Maquinaria;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface MaquinariaEntityMapperMaquinaria extends ActivoMapper<MaquinariaEntity, Maquinaria> {



}
