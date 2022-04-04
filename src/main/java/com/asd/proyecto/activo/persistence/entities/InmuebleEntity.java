package com.asd.proyecto.activo.persistence.entities;

import lombok.Data;
import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.PrimaryKeyJoinColumn;

@Data
@Entity
//@PrimaryKeyJoinColumn(name = "id_activo")
@DiscriminatorValue("inmueble")
@Polymorphism(type = PolymorphismType.EXPLICIT)
public class InmuebleEntity extends ActivoEntity {

    String tipoDeTela;


}
