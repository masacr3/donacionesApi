package com.masacr3.donacionesApi.dto;

import com.masacr3.donacionesApi.mongo.Cbu;

public class RespuestaCbu {
    private String mensaje;
    private Cbu cbu;

    public RespuestaCbu(String mensaje, Cbu cbu) {
        this.mensaje = mensaje;
        this.cbu = cbu;
    }

    public String getMensaje() {
        return mensaje;
    }

    public Cbu getCbu() {
        return cbu;
    }
}
