package com.example;

import java.util.ArrayList;

public class Main {

       static final double PRECIO_GASOLINA_COP = 15332; // gasolina corriente
    static final double PRECIO_DIESEL_COP   = 11200; // ACPM (diesel)
    static final double PRECIO_BUNKER_COP   =  8500; // fuel oil buques

    public static void main(String[] args) {

       
        System.out.println(" INSTANCIACIÓN SEGURA ");

        BuqueCarga buque = new BuqueCarga("BQ-001", 80, 5000, 120);
        System.out.println("\n BUQUE DE CARGA");
        buque.mostrarDatos();

        System.out.println("\nViajando 200 km...");
        double combustibleAntesBuque = buque.getCombustible();
        buque.viajar(200);
        double consumidoBuque = combustibleAntesBuque - buque.getCombustible();
        System.out.println("Combustible tras viaje: " + buque.getCombustible() + " L");
        System.out.printf("Combustible consumido: %.1f L%n", consumidoBuque);
        System.out.printf("Costo combustible: $%,.0f COP%n", consumidoBuque * PRECIO_BUNKER_COP);

        buque.atracarEnPuerto();

        Transporte transporte = new Transporte("JHBS-001", 80, 1000);
        System.out.println("\n TRANSPORTE");
        transporte.mostrarDatos();

        System.out.println("\nViajando 150 km...");
        double combustibleAntesTransporte = transporte.getCombustible();
        transporte.viajar(150);
        double consumidoTransporte = combustibleAntesTransporte - transporte.getCombustible();
        System.out.println("Combustible tras viaje = " + transporte.getCombustible() + " L");
        System.out.printf("Combustible consumido = %.1f L%n", consumidoTransporte);
        System.out.printf("Costo combustible = $%,.0f COP%n", consumidoTransporte * PRECIO_GASOLINA_COP);

        CamionDeReparto camion = new CamionDeReparto("BOTERO-042", 16.5, 2000, true);
        System.out.println("\n CAMION DE REPARTO");
        camion.mostrarDatos();

        System.out.println("\nViajando 100 km con refrigeración...");
        double combustibleAntesCamion = camion.getCombustible();
        camion.viajar(100);
        double consumidoCamion = combustibleAntesCamion - camion.getCombustible();
        System.out.println("Combustible tras viaje: " + camion.getCombustible() + " L");
        System.out.printf("Combustible consumido: %.1f L%n", consumidoCamion);
        System.out.printf("Costo combustible: $%,.0f COP%n", consumidoCamion * PRECIO_DIESEL_COP);

        
        System.out.println("\nPRUEBA - EN-LINEA");

        Transporte transportePrueba = new Transporte("PRUEBA-001", 50, 500);
        System.out.println("Combustible inicial: " + transportePrueba.getCombustible());

        System.out.println("Llamando setCombustible(-20):");
        transportePrueba.setCombustible(-20);
        System.out.println("Combustible resultante: " + transportePrueba.getCombustible());

        System.out.println("\nLlamando setCombustible(150):");
        transportePrueba.setCombustible(150);
        System.out.println("Combustible resultante: " + transportePrueba.getCombustible());

       
        System.out.println("\n DEMOSTRACIÓN DE POLIMORFISMO ");
        System.out.println("ArrayList<Transporte> con Transporte, CamionDeReparto y BuqueCarga:\n");

        ArrayList<Transporte> flota = new ArrayList<>();
        flota.add(new Transporte("T-POLI-001", 100, 800));
        flota.add(new CamionDeReparto("C-POLI-002", 100, 2000, true));
        flota.add(new BuqueCarga("B-POLI-003", 100, 5000, 80));

        for (Transporte t : flota) {
            double antes = t.getCombustible();
            t.viajar(100);
            double consumido = antes - t.getCombustible();
            System.out.printf("  [%s] %s -> consumió %.1f L, combustible restante: %.1f L%n",
                    t.getClass().getSimpleName(), t.getidTransporte(), consumido, t.getCombustible());
        }
    }
}
