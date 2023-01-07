package com.alquimiasoft.clientebackend.service;

import com.alquimiasoft.clientebackend.repository.DireccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DireccionService {
    @Autowired
    private DireccionRepository direccionRepository;
    public DireccionService(DireccionRepository direccionRepository) {this.direccionRepository = direccionRepository;}
}
