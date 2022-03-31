package com.asd.proyecto.activo.usecase.service;

import com.asd.proyecto.activo.persistence.entities.InmuebleEntity;
import com.asd.proyecto.activo.persistence.entities.MaquinariaEntity;
import com.asd.proyecto.activo.usecase.dto.InmuebleDTO;
import com.asd.proyecto.activo.usecase.dto.MaquinariaDTO;
import com.asd.proyecto.activo.usecase.model.Inmueble;
import com.asd.proyecto.activo.usecase.model.Maquinaria;
import org.springframework.stereotype.Service;

@Service
public class MaquinariaService extends ActivoServiceImpl<MaquinariaDTO, Maquinaria, MaquinariaEntity>{
}
