package com.example;

public class main {

    // Precios reales de combustible en Colombia (COP por litro, 2025)
    static final double PRECIO_GASOLINA_COP  = 15332; // gasolina corriente
    static final double PRECIO_DIESEL_COP    = 11200; // ACPM (diesel)
    static final double PRECIO_BUNKER_COP    =  8500; // fuel oil buques

    public static void main(String[] args) {

        
        BuqueCarga buque = new BuqueCarga("BQ-001", 80, 5000, 120);
        System.out.println();
        System.out.println(" BUQUE DE CARGA");
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
        System.out.printf("Costo combustible =$%,.0f COP%n", consumidoTransporte * PRECIO_GASOLINA_COP);


        CamionDeReparto camion = new CamionDeReparto("BOTERO-042", 16.5, 2000, true);

        System.out.println("\n CAMION DE REPARTO ");
        camion.mostrarDatos();
        System.err.println();

        System.out.println("\nViajando 100 km con refrigeración...");
        double combustibleAntesCamion = camion.getCombustible();
        camion.viajar(100);
        double consumidoCamion = combustibleAntesCamion - camion.getCombustible();
        System.out.println("Combustible tras viaje: " + camion.getCombustible() + " L");
        System.out.printf("Combustible consumido: %.1f L%n", consumidoCamion);
        System.out.printf("Costo combustible: $%,.0f COP%n", consumidoCamion * PRECIO_DIESEL_COP);
    }
}


// package com.example;

// import java.util.ArrayList;

// public class Main {
//     public static void main(String[] args) {
//         CamionDeReparto camion = new CamionDeReparto("CAM123", 100, 500, true);
//         BuqueCarga buque = new BuqueCarga("BUQ456", 200, 5000, 50);

        
//         camion.setCombustible(-20);
//         System.out.println("Combustible actual: " + camion.getCombustible());

       
//         ArrayList<Transporte> flota = new ArrayList<>();
//         flota.add(camion);
//         flota.add(buque);

//         for (Transporte t : flota) {
//             t.viajar(100);
//             t.mostrarDatos();
//             System.out.println("--------------------");
//         }
//     }
// }