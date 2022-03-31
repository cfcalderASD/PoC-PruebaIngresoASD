package com.asd.proyecto.activo.usecase.service;

import com.asd.proyecto.activo.usecase.dto.ActivoDTO;
import com.asd.proyecto.activo.usecase.model.Activo;
import com.asd.proyecto.util.BaseResponse;

import java.time.LocalDate;
import java.util.stream.Stream;

public interface ActivoService<T extends ActivoDTO, E extends Activo> {

    BaseResponse<Stream<T>> getAllActivos();
    BaseResponse<Stream<T>> getActivoByDate(LocalDate date);
    BaseResponse<T> getActivoBySerial(String serial);
    BaseResponse<T> saveActivo(E activo);
    BaseResponse<T> updateActivo(E activo);

}
