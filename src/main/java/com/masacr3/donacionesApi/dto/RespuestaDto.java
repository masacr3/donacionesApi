package com.masacr3.donacionesApi.dto;

import com.masacr3.donacionesApi.mongo.Usuario;

public class RespuestaDto {
    private String mensaje;
    private Usuario usuario;

    public RespuestaDto(String mensaje, Usuario usuario) {
        this.mensaje = mensaje;
        this.usuario = usuario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
