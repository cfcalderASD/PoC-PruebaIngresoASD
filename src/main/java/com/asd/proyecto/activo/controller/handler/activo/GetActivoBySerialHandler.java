package com.asd.proyecto.activo.controller.handler.activo;

import com.asd.proyecto.activo.controller.endpoint.ActivoEndpoint;
import com.asd.proyecto.activo.usecase.dto.ActivoDTO;
import com.asd.proyecto.activo.usecase.dto.InmuebleDTO;
import com.asd.proyecto.activo.usecase.model.Activo;
import com.asd.proyecto.activo.usecase.model.Inmueble;
import com.asd.proyecto.activo.usecase.service.ActivoService;
import com.asd.proyecto.util.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ActivoEndpoint.ACTIVO_ENDPOINT)
public class GetActivoBySerialHandler {

    @Autowired
    private ActivoService<ActivoDTO, Activo> service;

    @GetMapping(ActivoEndpoint.GET_ACTIVO_BY_SERIAL)
    public BaseResponse<ActivoDTO> execute(@PathVariable String serial){
        return service.getActivoBySerial(serial);
    }
}
