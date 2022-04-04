package com.asd.proyecto.activo.persistence.repository;

import com.asd.proyecto.activo.persistence.dao.ActivoDAO;
import com.asd.proyecto.activo.persistence.entities.ActivoEntity;
import com.asd.proyecto.activo.usecase.model.Activo;

import java.time.LocalDate;
import java.util.stream.Stream;

public interface ActivoRepositoryGeneric<T extends ActivoEntity, E extends Activo> {

    Stream<Activo> findAllActivo();
    Stream<Activo> findActivoByDate(LocalDate date);
    Activo getActivoBySerial(String serial);
    Activo saveActivo(Activo activo);
    Activo updateActivo(Activo activo);

}
