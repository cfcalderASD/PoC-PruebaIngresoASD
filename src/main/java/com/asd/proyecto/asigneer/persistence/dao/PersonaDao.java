package com.asd.proyecto.asigneer.persistence.dao;

import com.asd.proyecto.asigneer.persistence.entities.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaDao extends JpaRepository<PersonaEntity, Long> {

    PersonaEntity findByCedula(String cedula);

}
