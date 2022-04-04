package com.asd.proyecto.activo.controller.handler.inmueble;

import com.asd.proyecto.activo.controller.endpoint.ActivoEndpoint;
import com.asd.proyecto.activo.persistence.entities.InmuebleEntity;
import com.asd.proyecto.activo.persistence.repository.ActivoRepositoryGeneric;
import com.asd.proyecto.activo.usecase.dto.ActivoDTO;
import com.asd.proyecto.activo.usecase.dto.InmuebleDTO;
import com.asd.proyecto.activo.usecase.model.Activo;
import com.asd.proyecto.activo.usecase.model.Inmueble;
import com.asd.proyecto.activo.usecase.service.ActivoService;
import com.asd.proyecto.util.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ActivoEndpoint.INMUEBLE_ENDPOINT)
public class SaveInmuebleHandler {

    @Autowired
    private ActivoService<InmuebleDTO, Inmueble> service;

    @PostMapping
    public BaseResponse<ActivoDTO> execute(@RequestBody Inmueble inmueble){
        return service.saveActivo(inmueble);
    }

}
