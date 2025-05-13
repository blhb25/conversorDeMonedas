package com.conversor;

import com.google.gson.JsonObject;
import java.util.Map;
import java.util.HashMap;
import java.io.IOException;

public class CurrencyConverter {

    private final ExchangeRateService exchangeRateService;
    private Map<String, Double> exchangeRates;

    public CurrencyConverter(ExchangeRateService exchangeRateService) {
        this.exchangeRateService = exchangeRateService;
        this.exchangeRates = new HashMap<>();
    }

    public void updateRates(String baseCurrency) throws IOException, InterruptedException {
        JsonObject rates = exchangeRateService.getExchangeRates(baseCurrency);
        if (rates != null) {
            exchangeRates.clear();
            rates.entrySet().forEach(entry -> exchangeRates.put(entry.getKey(), entry.getValue().getAsDouble()));
        } else {
            System.out.println("Error al obtener las tasas de cambio para " + baseCurrency);
        }
    }

    public double convert(String fromCurrency, String toCurrency, double amount) {
        if (exchangeRates.containsKey(fromCurrency) && exchangeRates.containsKey(toCurrency)) {
            double fromRate = exchangeRates.get(fromCurrency);
            double toRate = exchangeRates.get(toCurrency);
            return (amount / fromRate) * toRate;
        } else {
            System.out.println("Error: No se encontraron tasas para una o ambas monedas.");
            return 0.0;
        }
    }

    public boolean isCurrencySupported(String currencyCode) {
        return exchangeRates.containsKey(currencyCode);
    }
}