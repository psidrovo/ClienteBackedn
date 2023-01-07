package com.alquimiasoft.clientebackend.entity;


import jakarta.persistence.*;

import java.util.List;

/**
 *
 * @author Pidrovo
 */
@Entity
@Table(name="cliente")
public class Cliente {
    @Id
    @Column(name = "id",unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    String id;
    @Column(name = "tipo", length = 255)
    String tipo;
    @Column(name = "identificacion", length = 40,unique = true)
    String identificacion;
    @Column(name = "numero_identificacion", length = 13)
    String numeroIdentificacion;
    @Column(name = "nombre", length = 255)
    String nombre;
    @Column(name = "correo", length = 255)
    String correo;
    @Column(name = "numero_telefono", length = 10)
    String numeroTelefono;

    @OneToMany
    @JoinColumn(name="cliente_id")
    private List<Direccion> direccionList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public List<Direccion> getDireccionList() {
        return direccionList;
    }

    public void setDireccionList(List<Direccion> direccionList) {
        this.direccionList = direccionList;
    }
}
