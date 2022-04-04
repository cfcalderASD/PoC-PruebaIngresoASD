package com.asd.proyecto.activo.usecase.builder;

import com.asd.proyecto.activo.persistence.mapper.ActivoMapper;
import com.asd.proyecto.activo.usecase.builder.impl.ActivoDtoConverter;
import com.asd.proyecto.activo.usecase.builder.impl.InmuebleDtoConverter;
import com.asd.proyecto.activo.usecase.builder.impl.MaquinariaDtoConverter;

import java.util.HashMap;

public class DtoMapperConfiguration {

    private HashMap<String, DtoMapper> mapperMap;

    public DtoMapperConfiguration(){
        mapperMap = new HashMap<>();
        mapperMap.put("inmueble", new InmuebleDtoConverter());
        mapperMap.put("maquinaria", new MaquinariaDtoConverter());
        mapperMap.put("generico", new ActivoDtoConverter());
    }

    public HashMap<String, DtoMapper> getMapperMap(){
        return mapperMap;
    }

}
