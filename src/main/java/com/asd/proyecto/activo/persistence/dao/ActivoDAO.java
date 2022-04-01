package com.asd.proyecto.activo.persistence.dao;

import com.asd.proyecto.activo.persistence.entities.ActivoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

import java.time.LocalDate;
import java.util.List;

@NoRepositoryBean
public interface ActivoDAO<T extends ActivoEntity> extends JpaRepository<T, Long> {

    List<T> findByFechaCompra(LocalDate fechaCompra);
    T findBySerial(String serial);


}
