package com.alquimiasoft.clientebackend.controller;

import com.alquimiasoft.clientebackend.entity.Cliente;
import com.alquimiasoft.clientebackend.service.ClienteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cliente")
@Tag(name = "Cliente", description = "Metodos Rest de modelo Cliente")
public class ClienteRestController {
    private ClienteService clienteService;

    public ClienteRestController(ClienteService clienteService){
        this.clienteService = clienteService;
    }

    @GetMapping("/")
    @Operation(summary = "Lista todos los socios disponibles")
    public String lista(){
        return "Hello";
    }

    @PostMapping("/")
    @Operation(summary = "Crear un cliente")
    public Cliente crear(Cliente Cliente){
        return clienteService.save(Cliente);
    }
}
