package com.asd.proyecto.asigneer.controller.handler.persona;

import com.asd.proyecto.asigneer.controller.endpoint.PersonaEndpoint;
import com.asd.proyecto.asigneer.persistence.entities.PersonaEntity;
import com.asd.proyecto.asigneer.persistence.repository.PersonaRepository;
import com.asd.proyecto.util.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Stream;

@RestController
@RequestMapping(PersonaEndpoint.PERSONA_ENDPOINT)
public class GetPersonaHandler {

    @Autowired
    private PersonaRepository repository;

    @GetMapping
    public BaseResponse<Stream<PersonaEntity>> execute(){
        return new BaseResponse<>(repository.findAllPersona());
    }

}
