package com.conversor;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ExchangeRateService service = new ExchangeRateService();
        CurrencyConverter converter = new CurrencyConverter(service);
        Conversor conversor = new Conversor(converter);

        try {
            conversor.mostrarMenu();
        } catch (IOException e) {
            System.err.println("Error de IO en la aplicación: " + e.getMessage());
        } catch (InterruptedException e) {
            System.err.println("Cambió la aplicación por interrupción: " + e.getMessage());
        }
    }
}