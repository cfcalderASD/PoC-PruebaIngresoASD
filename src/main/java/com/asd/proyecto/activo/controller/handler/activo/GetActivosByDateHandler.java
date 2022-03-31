package com.asd.proyecto.activo.controller.handler.activo;

import com.asd.proyecto.activo.controller.endpoint.ActivoEndpoint;
import com.asd.proyecto.activo.usecase.dto.ActivoDTO;
import com.asd.proyecto.activo.usecase.model.Activo;
import com.asd.proyecto.activo.usecase.service.ActivoService;
import com.asd.proyecto.util.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.stream.Stream;

@RestController
@RequestMapping(ActivoEndpoint.ACTIVO_ENDPOINT)
public class GetActivosByDateHandler {

    @Autowired
    private ActivoService<ActivoDTO, Activo> service;

    @GetMapping(ActivoEndpoint.GET_ACTIVOS_BY_DATE)
    public BaseResponse<Stream<ActivoDTO>> execute(@PathVariable String date){
        return service.getActivoByDate(LocalDate.parse(date));
    }

}
