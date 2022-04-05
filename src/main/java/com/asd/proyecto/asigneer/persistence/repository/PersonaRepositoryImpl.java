package com.asd.proyecto.asigneer.persistence.repository;

import com.asd.proyecto.asigneer.persistence.dao.PersonaDao;
import com.asd.proyecto.asigneer.persistence.entities.PersonaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public class PersonaRepositoryImpl implements PersonaRepository{

    @Autowired
    private PersonaDao dao;

    @Override
    public Stream<PersonaEntity> findAllPersona() {
        return dao.findAll().stream();
    }

    @Override
    public PersonaEntity findPersonaByCedula(String cedula) {
        return dao.findByCedula(cedula);
    }

    @Override
    public PersonaEntity savePersona(PersonaEntity personaEntity) {
        return dao.save(personaEntity);
    }
}
