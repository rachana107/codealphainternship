package stockMarket;

public class Trade {
    public static void buyStock(User user, Market market, String symbol, int quantity) {
        double price = market.getStockPrice(symbol);
        if (price == -1.0) {
            System.out.println("Stock symbol not found.");
            return;
        }

        double cost = price * quantity;
        if (user.getCashBalance() < cost) {
            System.out.println("Insufficient funds.");
            return;
        }

        user.updateCashBalance(-cost);
        user.getPortfolio().addStock(symbol, quantity);
        System.out.println("Bought " + quantity + " shares of " + symbol);
    }

    public static void sellStock(User user, Market market, String symbol, int quantity) {
        double price = market.getStockPrice(symbol);
        if (price == -1.0) {
            System.out.println("Stock symbol not found.");
            return;
        }

        user.getPortfolio().removeStock(symbol, quantity);
        double revenue = price * quantity;
        user.updateCashBalance(revenue);
        System.out.println("Sold " + quantity + " shares of " + symbol);
    }
}

