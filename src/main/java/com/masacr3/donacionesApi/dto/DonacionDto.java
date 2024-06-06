package com.masacr3.donacionesApi.dto;

public class DonacionDto extends PersonaDto {
    private Integer monto;

    public DonacionDto(String nombre, String provincia, Integer monto) {
        super(nombre, provincia);
        this.monto = monto;
    }

    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }
}
