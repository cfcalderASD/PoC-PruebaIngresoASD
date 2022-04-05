package com.asd.proyecto.asigneer.persistence.dao;

import com.asd.proyecto.asigneer.persistence.entities.AsigneerEntity;
import com.asd.proyecto.asigneer.persistence.entities.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Stream;

@Repository
public interface AsigneerDao extends JpaRepository<AsigneerEntity, Long> {

    List<AsigneerEntity> findByPersonaEntity(PersonaEntity personaEntity);
    List<AsigneerEntity> findByAreaEntity(PersonaEntity personaEntity);
    List<AsigneerEntity> findByAsignado(boolean asignado);

}
