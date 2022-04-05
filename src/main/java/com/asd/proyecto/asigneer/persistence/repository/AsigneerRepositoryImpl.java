package com.asd.proyecto.asigneer.persistence.repository;

import com.asd.proyecto.asigneer.persistence.dao.AsigneerDao;
import com.asd.proyecto.asigneer.persistence.entities.AsigneerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public class AsigneerRepositoryImpl implements AsigneerRepository{

    @Autowired
    private AsigneerDao dao;

    @Override
    public Stream<AsigneerEntity> findAllAsigneer() {
        return dao.findAll().stream();
    }

    @Override
    public Stream<AsigneerEntity> findAllAsigneerCurrentlyAsigned() {
        return dao.findByAsignado(Boolean.TRUE).stream();
    }

    @Override
    public AsigneerEntity findAsigneerById(Long id) {
        return dao.getById(id);
    }

    @Override
    public AsigneerEntity saveAsigneer(AsigneerEntity asigneerEntity) {
        return dao.save(asigneerEntity);
    }

    @Override
    public AsigneerEntity dismissAsigneer(Long id) {
        AsigneerEntity asigneerDB = dao.getById(id);
        asigneerDB.setAsignado(Boolean.FALSE);
        return dao.save(asigneerDB);
    }
}
