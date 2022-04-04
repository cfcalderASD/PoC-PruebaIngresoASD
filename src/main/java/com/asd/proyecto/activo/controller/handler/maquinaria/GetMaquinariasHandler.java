package com.asd.proyecto.activo.controller.handler.maquinaria;

import com.asd.proyecto.activo.controller.endpoint.ActivoEndpoint;
import com.asd.proyecto.activo.usecase.dto.ActivoDTO;
import com.asd.proyecto.activo.usecase.dto.InmuebleDTO;
import com.asd.proyecto.activo.usecase.dto.MaquinariaDTO;
import com.asd.proyecto.activo.usecase.model.Inmueble;
import com.asd.proyecto.activo.usecase.model.Maquinaria;
import com.asd.proyecto.activo.usecase.service.ActivoService;
import com.asd.proyecto.util.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Stream;

@RestController
@RequestMapping(ActivoEndpoint.MAQUINARIA_ENDPOINT)
public class GetMaquinariasHandler {

    @Autowired
    ActivoService<MaquinariaDTO, Maquinaria> service;

    @GetMapping
    public BaseResponse<Stream<ActivoDTO>> execute(){
        return service.getAllActivos();
    }

}
