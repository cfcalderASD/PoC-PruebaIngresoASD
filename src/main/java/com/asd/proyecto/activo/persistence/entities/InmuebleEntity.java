package com.asd.proyecto.activo.persistence.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Data
@Entity
@PrimaryKeyJoinColumn(name = "id_activo")
public class InmuebleEntity extends ActivoEntity {

    String tipoDeTela;
}
