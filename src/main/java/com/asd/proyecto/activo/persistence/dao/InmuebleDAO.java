package com.asd.proyecto.activo.persistence.dao;

import com.asd.proyecto.activo.persistence.entities.ActivoEntity;
import com.asd.proyecto.activo.persistence.entities.InmuebleEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface InmuebleDAO extends ActivoDAO<InmuebleEntity> {
}
