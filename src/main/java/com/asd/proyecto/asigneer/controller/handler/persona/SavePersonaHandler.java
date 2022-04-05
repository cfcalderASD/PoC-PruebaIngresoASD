package com.asd.proyecto.asigneer.controller.handler.persona;

import com.asd.proyecto.asigneer.controller.endpoint.PersonaEndpoint;
import com.asd.proyecto.asigneer.persistence.entities.PersonaEntity;
import com.asd.proyecto.asigneer.persistence.repository.PersonaRepository;
import com.asd.proyecto.util.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(PersonaEndpoint.PERSONA_ENDPOINT)
public class SavePersonaHandler {

    @Autowired
    private PersonaRepository repository;

    @PostMapping
    public BaseResponse<PersonaEntity> execute(@RequestBody PersonaEntity personaEntity){
        return new BaseResponse<>(repository.savePersona(personaEntity));
    }

}
