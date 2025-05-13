package com.conversor;

import java.util.Scanner;
import java.io.IOException;
import java.lang.InterruptedException;

public class Conversor {

    private final CurrencyConverter currencyConverter;
    private final Scanner scanner = new Scanner(System.in);

    public Conversor(CurrencyConverter currencyConverter) {
        this.currencyConverter = currencyConverter;
    }

    public void mostrarMenu() throws IOException, InterruptedException {
        System.out.println("Bienvenido/a al Conversor de Monedas 🪙");

        while (true) {
            System.out.println("\nElige la moneda base para obtener las tasas:");
            System.out.println("1. USD (Dólar estadounidense)");
            System.out.println("2. EUR (Euro)"); // Puedes añadir más si lo deseas
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            int baseOption = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            String baseCurrency = "";
            if (baseOption == 1) {
                baseCurrency = "USD";
            } else if (baseOption == 2) {
                baseCurrency = "EUR";
            } else if (baseOption == 3) {
                break;
            } else {
                System.out.println("Opción inválida.");
                continue;
            }

            currencyConverter.updateRates(baseCurrency);
            System.out.println("\nMonedas soportadas para la conversión:");
            // Aquí podrías listar las monedas soportadas si lo deseas

            System.out.print("Introduce la moneda de origen (código ISO): ");
            String origen = scanner.next().toUpperCase();

            System.out.print("Introduce la cantidad: ");
            double cantidad = scanner.nextDouble();

            System.out.print("Introduce la moneda destino (código ISO): ");
            String destino = scanner.next().toUpperCase();

            if (currencyConverter.isCurrencySupported(origen) && currencyConverter.isCurrencySupported(destino)) {
                double resultado = currencyConverter.convert(origen, destino, cantidad);
                System.out.printf("Resultado: %.2f %s%n", resultado, destino);
            } else {
                System.out.println("Error: Una o ambas monedas no son soportadas.");
            }
        }

        System.out.println("Gracias por usar el conversor 🫶");
        scanner.close();
    }
}