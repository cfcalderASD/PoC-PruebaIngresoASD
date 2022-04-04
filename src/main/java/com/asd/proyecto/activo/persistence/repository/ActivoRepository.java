package com.asd.proyecto.activo.persistence.repository;

import com.asd.proyecto.activo.persistence.entities.ActivoEntity;
import com.asd.proyecto.activo.persistence.mapper.ActivoMapperConfiguration;
import com.asd.proyecto.activo.usecase.model.Activo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Stream;

@Repository
public class ActivoRepository extends GenericRepository<ActivoEntity, Activo>{


}
