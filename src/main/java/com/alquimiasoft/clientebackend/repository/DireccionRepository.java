package com.alquimiasoft.clientebackend.repository;

import com.alquimiasoft.clientebackend.entity.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DireccionRepository extends JpaRepository<Direccion,Long> {

}
