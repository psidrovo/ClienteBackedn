package com.alquimiasoft.clientebackend.entity;

import jakarta.persistence.*;

@Entity
@Table(name="direccion")
public class Direccion {
    @Id
    @Column(name = "id",unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    String id;
    @Column(name = "provincia", length = 100)
    String provincia;
    @Column(name = "ciudad", length = 100)
    String ciudad;
    @Column(name = "direccion", length = 255)
    String direccion;
    @Column(name = "tipo", length = 100)
    String tipo;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
