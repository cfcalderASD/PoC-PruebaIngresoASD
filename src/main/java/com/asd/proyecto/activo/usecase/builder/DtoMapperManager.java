package com.asd.proyecto.activo.usecase.builder;

import com.asd.proyecto.activo.usecase.dto.ActivoDTO;
import com.asd.proyecto.activo.usecase.model.Activo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Component
public class DtoMapperManager {

    private static DtoMapperConfiguration dtoMapperConfiguration;

    public DtoMapperManager(){
        dtoMapperConfiguration = new DtoMapperConfiguration();
    }

    public static Activo dtoToModel(ActivoDTO activoDTO){
        return dtoMapperConfiguration.getMapperMap().get(activoDTO.getTipo()).dtoToModel(activoDTO);
    }

    public static ActivoDTO modelToDto(Activo activo){
        return dtoMapperConfiguration.getMapperMap().get(activo.getTipo()).modelToDto(activo);
    }

    public static Stream<Activo> dtoToModel(Iterable<ActivoDTO> activoDTOS){
        List<Activo> activoList = new ArrayList<>();
        for(ActivoDTO activoDTO: activoDTOS){
            activoList.add(dtoToModel(activoDTO));
        }
        return activoList.stream();
    }

    public static Stream<ActivoDTO> modelToDto(Iterable<Activo> activos){
        List<ActivoDTO> activoDTOS = new ArrayList<>();
        for(Activo activo: activos){
            activoDTOS.add(modelToDto(activo));
        }
        return activoDTOS.stream();
    }



}
