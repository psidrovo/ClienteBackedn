package com.alquimiasoft.clientebackend.service;

import com.alquimiasoft.clientebackend.entity.Cliente;
import com.alquimiasoft.clientebackend.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente save(Cliente cliente){
        return clienteRepository.save(cliente);
    }
}
