package com.asd.proyecto.activo.usecase.service;

import com.asd.proyecto.activo.persistence.entities.ActivoEntity;
import com.asd.proyecto.activo.usecase.dto.ActivoDTO;
import com.asd.proyecto.activo.usecase.model.Activo;
import org.springframework.stereotype.Service;

@Service
public class ActivoServiceActivo extends ActivoServiceImpl<ActivoDTO, Activo, ActivoEntity>{
}
