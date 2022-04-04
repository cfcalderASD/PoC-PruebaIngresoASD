package com.asd.proyecto.activo.persistence.mapper;

import com.asd.proyecto.activo.persistence.entities.ActivoEntity;
import com.asd.proyecto.activo.usecase.model.Activo;

public class ActivoMapperManager {

    private static ActivoMapperConfiguration activoMapperConfiguration;

    public ActivoMapperManager(){
        activoMapperConfiguration = new ActivoMapperConfiguration();
    }

    public static Activo entityToModel(ActivoEntity activoEntity){
        return activoMapperConfiguration.getMapperMap().get(activoEntity.getTipo()).entityToModel(activoEntity);
    }

    public static ActivoEntity modelToEntity(Activo activo){
        return activoMapperConfiguration.getMapperMap().get(activo.getTipo()).modelToEntity(activo);
    }

}
