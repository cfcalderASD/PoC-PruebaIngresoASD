package com.asd.proyecto.asigneer.controller.handler.asigneer;

import com.asd.proyecto.asigneer.controller.endpoint.AsigneerEndpoint;
import com.asd.proyecto.asigneer.persistence.entities.AsigneerEntity;
import com.asd.proyecto.asigneer.persistence.repository.AsigneerRepository;
import com.asd.proyecto.util.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(AsigneerEndpoint.ASIGNEER_ENDPOINT)
public class AssignActivoHandler {

    @Autowired
    private AsigneerRepository repository;

    @PostMapping
    public BaseResponse<AsigneerEntity> execute(@RequestBody AsigneerEntity entity){
        entity.setAsignado(Boolean.TRUE);
        return new BaseResponse<>(repository.saveAsigneer(entity));
    }

}
