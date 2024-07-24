package stockMarket;

import java.util.HashMap;
import java.util.Map;

public class Portfolio {
    private Map<String, Integer> stocks;

    public Portfolio() {
        stocks = new HashMap<>();
    }

    public void addStock(String symbol, int quantity) {
        stocks.put(symbol, stocks.getOrDefault(symbol, 0) + quantity);
    }

    public void removeStock(String symbol, int quantity) {
        if (stocks.containsKey(symbol)) {
            int currentQuantity = stocks.get(symbol);
            if (currentQuantity <= quantity) {
                stocks.remove(symbol);
            } else {
                stocks.put(symbol, currentQuantity - quantity);
            }
        }
    }

    public void displayPortfolio() {
        System.out.println("Your Portfolio:");
        for (Map.Entry<String, Integer> entry : stocks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " shares");
        }
    }
}

