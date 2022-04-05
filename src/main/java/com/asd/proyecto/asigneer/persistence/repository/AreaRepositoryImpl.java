package com.asd.proyecto.asigneer.persistence.repository;

import com.asd.proyecto.asigneer.persistence.dao.AreaDao;
import com.asd.proyecto.asigneer.persistence.entities.AreaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public class AreaRepositoryImpl implements AreaRepository{

    @Autowired
    private AreaDao dao;

    @Override
    public Stream<AreaEntity> findAllArea() {
        return dao.findAll().stream();
    }

    @Override
    public AreaEntity findAreaById(Long id) {
        return dao.getById(id);
    }

    @Override
    public AreaEntity saveArea(AreaEntity areaEntity) {
        return dao.save(areaEntity);
    }
}
