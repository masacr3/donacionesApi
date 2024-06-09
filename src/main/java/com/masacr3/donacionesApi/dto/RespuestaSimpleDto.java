package com.masacr3.donacionesApi.dto;

public class RespuestaSimpleDto {
    private String msj;

    public RespuestaSimpleDto(String msj) {
        this.msj = msj;
    }

    public String getMsj() {
        return msj;
    }

    public String getOk() {
        String ok = "Operacion exitosa";
        return ok;
    }
}
