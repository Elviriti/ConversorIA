package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Factores de conversión
        double KM_A_MILLAS = 0.621371;
        double MILLAS_A_KM = 1.60934;

        System.out.println("--- SUPER CONVERSOR ---");
        System.out.println("1. Kilómetros a Millas");
        System.out.println("2. Millas a Kilómetros");
        System.out.print("Elige una opción (1 o 2): ");

        int opcion = entrada.nextInt();

        if (opcion == 1) {
            // Lógica de KM a Millas
            System.out.print("Introduce kilómetros: ");
            double km = entrada.nextDouble();
            double resultado = km * KM_A_MILLAS;
            System.out.printf("%.2f kilómetros son %.2f millas.\n", km, resultado);

        } else if (opcion == 2) {
            // Nueva función: Lógica de Millas a KM
            System.out.print("Introduce millas: ");
            double millas = entrada.nextDouble();
            double resultado = millas * MILLAS_A_KM;
            System.out.printf("%.2f millas son %.2f kilómetros.\n", millas, resultado);

        } else {
            System.out.println("Opción no válida.");
        }

        entrada.close();
    }
}