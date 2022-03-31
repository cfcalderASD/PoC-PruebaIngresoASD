package com.asd.proyecto.activo.controller.handler.activo;

import com.asd.proyecto.activo.controller.endpoint.ActivoEndpoint;
import com.asd.proyecto.activo.usecase.dto.ActivoDTO;
import com.asd.proyecto.activo.usecase.model.Activo;
import com.asd.proyecto.activo.usecase.service.ActivoService;
import com.asd.proyecto.util.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ActivoEndpoint.ACTIVO_ENDPOINT)
public class UpdateActivoHandler {

    @Autowired
    private ActivoService<ActivoDTO, Activo> service;

    @PutMapping
    public BaseResponse<ActivoDTO> execute(@RequestBody Activo activo){
        return service.updateActivo(activo);
    }

}
