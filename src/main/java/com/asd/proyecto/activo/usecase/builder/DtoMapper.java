package com.asd.proyecto.activo.usecase.builder;

import com.asd.proyecto.activo.usecase.dto.ActivoDTO;
import com.asd.proyecto.activo.usecase.model.Activo;

public interface DtoMapper<DTO extends ActivoDTO, MODEL extends Activo> {

    MODEL dtoToModel(ActivoDTO activoDTO);
    DTO modelToDto(Activo activo);

}
