package com.asd.proyecto.activo.usecase.service;

import com.asd.proyecto.activo.persistence.entities.ActivoEntity;
import com.asd.proyecto.activo.persistence.entities.InmuebleEntity;
import com.asd.proyecto.activo.usecase.dto.ActivoDTO;
import com.asd.proyecto.activo.usecase.dto.InmuebleDTO;
import com.asd.proyecto.activo.usecase.model.Activo;
import com.asd.proyecto.activo.usecase.model.Inmueble;
import org.springframework.stereotype.Service;

@Service
public class InmuebleService extends ActivoServiceImpl<InmuebleDTO, Inmueble, InmuebleEntity>{
}
