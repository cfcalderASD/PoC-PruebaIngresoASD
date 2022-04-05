package com.asd.proyecto.asigneer.persistence.repository;

import com.asd.proyecto.asigneer.persistence.entities.AreaEntity;

import java.util.stream.Stream;

public interface AreaRepository {

    Stream<AreaEntity> findAllArea();
    AreaEntity findAreaById(Long id);
    AreaEntity saveArea(AreaEntity areaEntity);

}
