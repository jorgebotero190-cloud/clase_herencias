package com.example;

public class CamionDeReparto extends Transporte {
    private boolean tieneRefrigeracion;

    public CamionDeReparto(String id, double combustible, double CapacidadCarga, boolean tieneRefrigeracion) {
        super(id, combustible, CapacidadCarga);
        this.tieneRefrigeracion = tieneRefrigeracion;
    }

    @Override
    public void viajar(int distancia) {
        double consumoPor10km = tieneRefrigeracion ? 2 : 1;
        double consumo = (distancia / 10.0) * consumoPor10km;

        setCombustible(getCombustible() - consumo);
    }
}
