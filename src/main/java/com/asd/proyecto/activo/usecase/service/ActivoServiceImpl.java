package com.asd.proyecto.activo.usecase.service;

import com.asd.proyecto.activo.persistence.entities.ActivoEntity;
import com.asd.proyecto.activo.persistence.repository.ActivoRepositoryGeneric;
import com.asd.proyecto.activo.usecase.builder.DtoMapperManager;
import com.asd.proyecto.activo.usecase.dto.ActivoDTO;
import com.asd.proyecto.activo.usecase.model.Activo;
import com.asd.proyecto.util.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class ActivoServiceImpl<T extends ActivoDTO, E extends Activo, R extends ActivoEntity> implements ActivoService<T, E>{

    @Autowired
    private ActivoRepositoryGeneric<R, E> repository;


    @Override
    public BaseResponse<Stream<ActivoDTO>> getAllActivos() {
        List<E> activos = (List<E>) repository.findAllActivo().collect(Collectors.toList());
       return new BaseResponse<>(DtoMapperManager.modelToDto((Iterable<Activo>) activos));
    }

    @Override
    public BaseResponse<Stream<ActivoDTO>> getActivoByDate(LocalDate date) {
        List<E> activos = (List<E>) repository.findActivoByDate(date).collect(Collectors.toList());
        return new BaseResponse<>(DtoMapperManager.modelToDto((Iterable<Activo>) activos));
    }

    @Override
    public BaseResponse<ActivoDTO> getActivoBySerial(String serial) {
       E activo = (E) repository.getActivoBySerial(serial);
       return new BaseResponse<>(DtoMapperManager.modelToDto(activo));
    }

    @Override
    public BaseResponse<ActivoDTO> saveActivo(Activo activo) {
       E activoModel = (E) repository.saveActivo(activo);
       return new BaseResponse<>(DtoMapperManager.modelToDto(activoModel));
    }

    @Override
    public BaseResponse<ActivoDTO> updateActivo(Activo activo) {
        E activoModel = (E) repository.updateActivo(activo);
        return new BaseResponse<>(DtoMapperManager.modelToDto(activoModel));
    }
}
