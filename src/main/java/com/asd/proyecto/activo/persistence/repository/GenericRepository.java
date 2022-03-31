package com.asd.proyecto.activo.persistence.repository;

import com.asd.proyecto.activo.persistence.dao.ActivoDAO;
import com.asd.proyecto.activo.persistence.entities.ActivoEntity;
import com.asd.proyecto.activo.persistence.mapper.ActivoMapper;
import com.asd.proyecto.activo.usecase.model.Activo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

@Repository
public class GenericRepository<T extends ActivoEntity, E extends Activo> implements ActivoRepositoryGeneric<T, E>{

    @Autowired
    private ActivoDAO<T> activoDAO;

    @Autowired
    private ActivoMapper<T, E> activoMapper;

    @Override
    public Stream<E> findAllActivo() {
        List<T> activos = activoDAO.findAll();
        return activoMapper.leftToRight(activos);
    }

    @Override
    public Stream<E> findActivoByDate(LocalDate date) {
        List<T> activos = activoDAO.findByFechaCompra(date);
        return activoMapper.leftToRight(activos);
    }

    @Override
    public E getActivoBySerial(String serial) {
        T activo = activoDAO.findBySerial(serial);
        return activoMapper.leftToRight(activo);
    }

    @Override
    public E saveActivo(E activo) {
        T activoEntity = activoMapper.rightToLeft(activo);
        activoDAO.save(activoEntity);
        return activo;
    }

    @Override
    public E updateActivo(E activo) {
        String serial = activo.getSerial();
        T activoDB = activoDAO.findBySerial(serial);
        T activoEntity = activoMapper.rightToLeft(activo);
        activoEntity.setId(activoDB.getId());
        activoDAO.save(activoEntity);
        return activo;
    }
}
