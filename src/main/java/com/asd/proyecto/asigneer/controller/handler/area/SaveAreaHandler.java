package com.asd.proyecto.asigneer.controller.handler.area;

import com.asd.proyecto.asigneer.controller.endpoint.AreaEndpoint;
import com.asd.proyecto.asigneer.persistence.entities.AreaEntity;
import com.asd.proyecto.asigneer.persistence.entities.PersonaEntity;
import com.asd.proyecto.asigneer.persistence.repository.AreaRepository;
import com.asd.proyecto.asigneer.persistence.repository.PersonaRepository;
import com.asd.proyecto.util.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(AreaEndpoint.AREA_ENPOINT)
public class SaveAreaHandler {

    @Autowired
    private AreaRepository repository;

    @PostMapping
    public BaseResponse<AreaEntity> execute(@RequestBody AreaEntity areaEntity){
        return new BaseResponse<>(repository.saveArea(areaEntity));
    }

}
