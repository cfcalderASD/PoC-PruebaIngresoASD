package com.asd.proyecto.activo.persistence.repository;

import com.asd.proyecto.activo.persistence.dao.ActivoDAO;
import com.asd.proyecto.activo.persistence.entities.ActivoEntity;
import com.asd.proyecto.activo.usecase.model.Activo;

import java.time.LocalDate;
import java.util.stream.Stream;

public interface ActivoRepositoryGeneric<T extends ActivoEntity, E extends Activo> {

    public Stream<E> findAllActivo();
    public Stream<E> findActivoByDate(LocalDate date);
    public E getActivoBySerial(String serial);
    public E saveActivo(E activo);
    public E updateActivo(E activo);

}
