package com.asd.proyecto.asigneer.persistence.repository;


import com.asd.proyecto.asigneer.persistence.entities.PersonaEntity;

import java.util.stream.Stream;

public interface PersonaRepository {

    Stream<PersonaEntity> findAllPersona();
    PersonaEntity findPersonaByCedula(String cedula);
    PersonaEntity savePersona(PersonaEntity personaEntity);

}
