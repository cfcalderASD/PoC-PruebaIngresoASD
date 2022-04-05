package com.asd.proyecto.asigneer.controller.handler.asigneer;

import com.asd.proyecto.asigneer.controller.endpoint.AsigneerEndpoint;
import com.asd.proyecto.asigneer.persistence.dao.AsigneerDao;
import com.asd.proyecto.asigneer.persistence.entities.AsigneerEntity;
import com.asd.proyecto.asigneer.persistence.repository.AsigneerRepository;
import com.asd.proyecto.util.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(AsigneerEndpoint.ASIGNEER_ENDPOINT)
public class DismissActivoHandlerById {

    @Autowired
    private AsigneerRepository repository;

    @PutMapping(AsigneerEndpoint.DISMISS_ASIGNED)
    public BaseResponse<AsigneerEntity> execute(@PathVariable Long id){
        return new BaseResponse<>(repository.dismissAsigneer(id));
    }

}
