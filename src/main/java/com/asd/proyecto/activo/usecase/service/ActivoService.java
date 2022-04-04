package com.asd.proyecto.activo.usecase.service;

import com.asd.proyecto.activo.usecase.dto.ActivoDTO;
import com.asd.proyecto.activo.usecase.model.Activo;
import com.asd.proyecto.util.BaseResponse;

import java.time.LocalDate;
import java.util.stream.Stream;

public interface ActivoService<T extends ActivoDTO, E extends Activo> {

    BaseResponse<Stream<ActivoDTO>> getAllActivos();
    BaseResponse<Stream<ActivoDTO>> getActivoByDate(LocalDate date);
    BaseResponse<ActivoDTO> getActivoBySerial(String serial);
    BaseResponse<ActivoDTO> saveActivo(Activo activo);
    BaseResponse<ActivoDTO> updateActivo(Activo activo);

}
