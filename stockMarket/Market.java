package stockMarket;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Market {
    private Map<String, Double> stocks;

    public Market() {
        stocks = new HashMap<>();
        stocks.put("AAPL", 150.0);
        stocks.put("GOOGL", 2700.0);
        stocks.put("AMZN", 3400.0);
        // Add more stocks as needed
    }

    public void displayMarketData() {
        System.out.println("Market Data:");
        for (Map.Entry<String, Double> entry : stocks.entrySet()) {
            System.out.println(entry.getKey() + ": $" + entry.getValue());
        }
    }

    public double getStockPrice(String symbol) {
        return stocks.getOrDefault(symbol, -1.0);
    }

    public void updateStockPrice(String symbol, double newPrice) {
        stocks.put(symbol, newPrice);
    }
}

