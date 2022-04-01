package com.asd.proyecto.activo.persistence.dao;

import com.asd.proyecto.activo.persistence.entities.ActivoEntity;
import com.asd.proyecto.activo.persistence.entities.MaquinariaEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface MaquinariaDAO extends ActivoDAO<MaquinariaEntity> {
}
