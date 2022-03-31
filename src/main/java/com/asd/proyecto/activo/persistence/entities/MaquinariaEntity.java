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
@DiscriminatorValue("maquinaria")
//@PrimaryKeyJoinColumn(name = "id_activo")
@Polymorphism(type = PolymorphismType.EXPLICIT)
public class MaquinariaEntity extends ActivoEntity {

    String fabricante;

}
