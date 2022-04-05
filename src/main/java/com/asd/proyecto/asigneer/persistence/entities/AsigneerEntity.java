package com.asd.proyecto.asigneer.persistence.entities;

import com.asd.proyecto.activo.persistence.entities.ActivoEntity;
import lombok.Data;
import org.hibernate.annotations.Check;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
@Check(constraints = "(activo_entity_id IS NOT NULL) AND" +
        " ((area_entity_id IS NOT NULL OR persona_entity_id IS NOT NULL) AND " +
        "NOT (area_entity_id IS NOT NULL AND persona_entity_id IS NOT NULL))")
public class AsigneerEntity implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    @JoinColumn(name = "activo_entity_id")
    ActivoEntity activoEntity;

    @OneToOne
    @JoinColumn(name = "area_entity_id")
    AreaEntity areaEntity;

    @OneToOne
    @JoinColumn(name = "persona_entity_id")
    PersonaEntity personaEntity;

    LocalDate initDate;
    LocalDate finishDate;
    boolean asignado;

}
