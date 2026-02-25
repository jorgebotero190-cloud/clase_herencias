package com.example;


    public class Transporte {
    private String idTransporte;
    private double combustible;
    private double capacidadCarga;

    public Transporte(String idTransporte, double combustible, double capacidadCarga) {
        this.idTransporte = idTransporte;
        this.combustible = combustible;
        this.capacidadCarga = capacidadCarga;

    }

    public String getidTransporte() {
        return idTransporte;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double nivel) {
        if (nivel < 0) {
            this.combustible = 0;
            System.out.println("Error: El combustible no puede ser menor a 0. Se asignó 0.");
        } else if (nivel > 100) {
            this.combustible = 100;
            System.out.println("Error: El combustible no puede ser mayor a 100. Se asignó 100.");
        } else {
            this.combustible = nivel;
        }
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double carga) {
        if (carga < 0) {
            System.out.println("Error: Capacidad de carga inválida.");
        } else {
            this.capacidadCarga = carga;
        }
    }

    public void viajar(int distancia) {
        double consumo = (distancia / 10.0) * 1;
        combustible -= consumo;
        if (combustible < 0)
            combustible = 0;
    }

    public void mostrarDatos() {
        System.out.println("ID: " + idTransporte);
        System.out.println("Combustible: " + combustible);
        System.out.println("Capacidad de carga: " + capacidadCarga);
    }

}

