package com.masacr3.donacionesApi.dto;

public class CbuDto {
    private String codigo;
    private String id;

    public CbuDto() {
    }

    public CbuDto(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
