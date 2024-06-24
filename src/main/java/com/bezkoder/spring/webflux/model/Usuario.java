package com.bezkoder.spring.webflux.model;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;

public class Usuario {
    
    @Id
    private Integer idUsuario;
    private String usuario;
    private String contrasenia;
    private Timestamp fechaCreacion;

    public Usuario() {
    }

    public Usuario(Integer idUsuario, String usuario, String contrasenia, Timestamp fechaCreacion) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContrasenia() {
        return contrasenia;
    }
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    
}
