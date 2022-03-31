package com.asd.proyecto.activo.usecase.builder;

import com.asd.proyecto.activo.usecase.dto.ActivoDTO;
import com.asd.proyecto.activo.usecase.model.Activo;
import com.asd.proyecto.util.BaseConverter;

public interface ActivoMapperDTO<T extends Activo, E extends ActivoDTO> extends BaseConverter<T, E> {

}
