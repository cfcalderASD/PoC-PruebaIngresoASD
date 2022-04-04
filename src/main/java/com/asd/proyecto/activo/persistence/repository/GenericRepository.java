package com.asd.proyecto.activo.persistence.repository;

import com.asd.proyecto.activo.persistence.dao.ActivoDAO;
import com.asd.proyecto.activo.persistence.entities.ActivoEntity;
import com.asd.proyecto.activo.persistence.mapper.ActivoMapper;
import com.asd.proyecto.activo.persistence.mapper.ActivoMapperManager;
import com.asd.proyecto.activo.usecase.model.Activo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class GenericRepository<T extends ActivoEntity, E extends Activo> implements ActivoRepositoryGeneric<T, E>{

    @Autowired
    protected ActivoDAO<T> activoDAO;


    @Override
    public Stream<Activo> findAllActivo() {
        List<T> activos =  activoDAO.findAll();
        return ActivoMapperManager.entityToModel((Iterable<ActivoEntity>) activos);
    }

    @Override
    public Stream<Activo> findActivoByDate(LocalDate date) {
        List<T> activos = activoDAO.findByFechaCompra(date);
        return ActivoMapperManager.entityToModel((Iterable<ActivoEntity>) activos);
    }

    @Override
    public Activo getActivoBySerial(String serial) {
        T activo = activoDAO.findBySerial(serial);
        return ActivoMapperManager.entityToModel(activo);
    }

    @Override
    public E saveActivo(Activo activo) {
        T activoEntity = (T) ActivoMapperManager.modelToEntity(activo);
        activoDAO.save(activoEntity);
        return (E) activo;
    }

    @Override
    public E updateActivo(Activo activo) {
        String serial = activo.getSerial();
        T activoDB = activoDAO.findBySerial(serial);
        T activoEntity = (T) ActivoMapperManager.modelToEntity(activo);
        activoEntity.setId(activoDB.getId());
        activoDAO.save(activoEntity);
        return (E) activo;
    }
}
