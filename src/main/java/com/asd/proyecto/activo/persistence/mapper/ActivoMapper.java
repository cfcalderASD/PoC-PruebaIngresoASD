package com.asd.proyecto.activo.persistence.mapper;

import com.asd.proyecto.activo.persistence.entities.ActivoEntity;
import com.asd.proyecto.activo.usecase.model.Activo;
import com.asd.proyecto.util.BaseConverter;

public interface ActivoMapper<ENTITY extends ActivoEntity, MODEL extends Activo> extends BaseConverter<ENTITY, MODEL>{

}
