package com.example;

public class BuqueCarga extends Transporte {
    private int cantidadContenedores;

    public BuqueCarga(String idTransporte, double combustible, double capacidad, int cantidadContenedores) {
        super(idTransporte, combustible, capacidad);
        this.cantidadContenedores = cantidadContenedores;
    }

    public void atracarEnPuerto() {
        System.out.println("El transporte " + getidTransporte() +
                " está listo para descarga.");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Cantidad de contenedores: " + cantidadContenedores);

        double costoViaje = getCapacidadCarga() * 10; // ejemplo cálculo USD
        System.out.println("Costo estimado del viaje: $" + costoViaje);
    }
}
