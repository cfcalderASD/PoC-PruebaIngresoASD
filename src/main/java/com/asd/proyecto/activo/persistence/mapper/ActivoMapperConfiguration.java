package com.asd.proyecto.activo.persistence.mapper;

import com.asd.proyecto.activo.persistence.entities.ActivoEntity;
import com.asd.proyecto.activo.persistence.mapper.impl.ActivoConverter;
import com.asd.proyecto.activo.persistence.mapper.impl.InmuebleConverter;
import com.asd.proyecto.activo.persistence.mapper.impl.MaquinariaConverter;
import com.asd.proyecto.activo.usecase.model.Activo;
import lombok.Getter;

import java.util.HashMap;
import java.util.List;


public class ActivoMapperConfiguration{

    private HashMap<String, ActivoMapper> mapperMap;

    public ActivoMapperConfiguration(){
        mapperMap = new HashMap<>();
        mapperMap.put("inmueble", new InmuebleConverter());
        mapperMap.put("maquinaria", new MaquinariaConverter());
        mapperMap.put("generico", new ActivoConverter());
    }

    public HashMap<String, ActivoMapper>  getMapperMap(){
        return mapperMap;
    }


}
