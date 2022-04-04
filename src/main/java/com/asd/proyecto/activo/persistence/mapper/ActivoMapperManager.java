package com.asd.proyecto.activo.persistence.mapper;

import com.asd.proyecto.activo.persistence.entities.ActivoEntity;
import com.asd.proyecto.activo.usecase.model.Activo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

@Component
public class ActivoMapperManager {

    private static ActivoMapperConfiguration activoMapperConfiguration;

    public ActivoMapperManager(){
        activoMapperConfiguration = new ActivoMapperConfiguration();
    }

    public static Activo entityToModel(ActivoEntity activoEntity){
        return activoMapperConfiguration.getMapperMap().get(activoEntity.
                getTipo()).entityToModel(activoEntity);
    }

    public static ActivoEntity modelToEntity(Activo activo){
        return activoMapperConfiguration.getMapperMap().
                get(activo.getTipo()).modelToEntity(activo);
    }

    public static Stream<Activo> entityToModel(Iterable<ActivoEntity> activoEntities){
        List<Activo> activoList = new ArrayList<>();
        for(ActivoEntity activoEntity: activoEntities){
            activoList.add(entityToModel(activoEntity));
        }
        return activoList.stream();
    }

    public static Stream<ActivoEntity> modelToEntity(Iterable<Activo> activos){
        List<ActivoEntity> activoEntities = new ArrayList<>();
        for(Activo activo: activos){
            activoEntities.add(modelToEntity(activo));
        }
        return activoEntities.stream();
    }

}
