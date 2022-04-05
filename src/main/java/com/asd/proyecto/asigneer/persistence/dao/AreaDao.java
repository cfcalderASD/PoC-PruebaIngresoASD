package com.asd.proyecto.asigneer.persistence.dao;

import com.asd.proyecto.asigneer.persistence.entities.AreaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaDao extends JpaRepository<AreaEntity, Long> {

}
