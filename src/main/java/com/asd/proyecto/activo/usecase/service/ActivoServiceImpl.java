package com.asd.proyecto.activo.usecase.service;

import com.asd.proyecto.activo.persistence.entities.ActivoEntity;
import com.asd.proyecto.activo.persistence.repository.ActivoRepositoryGeneric;
import com.asd.proyecto.activo.usecase.builder.ActivoMapperDTO;
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

    @Autowired
    private ActivoMapperDTO<E, T> mapper;

    @Override
    public BaseResponse<Stream<T>> getAllActivos() {
        List<E> activos = repository.findAllActivo().collect(Collectors.toList());
        return new BaseResponse<>(mapper.leftToRight(activos));
    }

    @Override
    public BaseResponse<Stream<T>> getActivoByDate(LocalDate date) {
        List<E> activos = repository.findActivoByDate(date).collect(Collectors.toList());
        return new BaseResponse<>(mapper.leftToRight(activos));
    }

    @Override
    public BaseResponse<T> getActivoBySerial(String serial) {
        E activo = repository.getActivoBySerial(serial);
        return new BaseResponse<>(mapper.leftToRight(activo));
    }

    @Override
    public BaseResponse<T> saveActivo(E activo) {
       E activoModel = repository.saveActivo(activo);
       return new BaseResponse<>(mapper.leftToRight(activoModel));
    }

    @Override
    public BaseResponse<T> updateActivo(E activo) {
        E activoModel = repository.updateActivo(activo);
        return new BaseResponse<>(mapper.leftToRight(activoModel));
    }
}
