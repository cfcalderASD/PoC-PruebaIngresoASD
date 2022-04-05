package com.asd.proyecto.asigneer.persistence.repository;

import com.asd.proyecto.asigneer.persistence.entities.AsigneerEntity;

import java.util.stream.Stream;

public interface AsigneerRepository {

    Stream<AsigneerEntity> findAllAsigneer();
    Stream<AsigneerEntity> findAllAsigneerCurrentlyAsigned();
    AsigneerEntity findAsigneerById(Long id);
    AsigneerEntity saveAsigneer(AsigneerEntity asigneerEntity);
    AsigneerEntity dismissAsigneer(Long id);


}
