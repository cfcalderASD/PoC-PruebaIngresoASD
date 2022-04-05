package com.asd.proyecto.asigneer.controller.handler.area;

import com.asd.proyecto.asigneer.controller.endpoint.AreaEndpoint;
import com.asd.proyecto.asigneer.persistence.entities.AreaEntity;
import com.asd.proyecto.asigneer.persistence.entities.PersonaEntity;
import com.asd.proyecto.asigneer.persistence.repository.AreaRepository;
import com.asd.proyecto.asigneer.persistence.repository.PersonaRepository;
import com.asd.proyecto.util.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Stream;

@RestController
@RequestMapping(AreaEndpoint.AREA_ENPOINT)
public class GetAreaHandler {

    @Autowired
    private AreaRepository repository;

    @GetMapping
    public BaseResponse<Stream<AreaEntity>> execute(){
        return new BaseResponse<>(repository.findAllArea());
    }

}
