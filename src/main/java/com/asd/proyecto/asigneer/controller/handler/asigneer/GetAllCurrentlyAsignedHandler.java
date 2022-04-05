package com.asd.proyecto.asigneer.controller.handler.asigneer;

import com.asd.proyecto.asigneer.controller.endpoint.AsigneerEndpoint;
import com.asd.proyecto.asigneer.persistence.entities.AsigneerEntity;
import com.asd.proyecto.asigneer.persistence.repository.AsigneerRepository;
import com.asd.proyecto.util.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Stream;

@RestController
@RequestMapping(AsigneerEndpoint.ASIGNEER_ENDPOINT)
public class GetAllCurrentlyAsignedHandler {

    @Autowired
    private AsigneerRepository repository;

    @GetMapping(AsigneerEndpoint.GET_CURRENTLY_ASIGNED)
    public BaseResponse<Stream<AsigneerEntity>> execute(){
        return new BaseResponse<>(repository.findAllAsigneerCurrentlyAsigned());
    }


}
