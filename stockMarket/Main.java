package stockMarket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Market market = new Market();
        User user = new User("john_doe", "password", 100000);  // example user with initial cash

        System.out.println("Welcome to the Simulated Stock Trading Platform!");

        while (true) {
            System.out.println("\n1. View Market Data");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View Portfolio");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    market.displayMarketData();
                    break;
                case 2:
                    System.out.print("Enter stock symbol: ");
                    String symbol = scanner.next();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    Trade.buyStock(user, market, symbol, quantity);
                    break;
                case 3:
                    System.out.print("Enter stock symbol: ");
                    symbol = scanner.next();
                    System.out.print("Enter quantity: ");
                    quantity = scanner.nextInt();
                    Trade.sellStock(user, market, symbol, quantity);
                    break;
                case 4:
                    user.getPortfolio().displayPortfolio();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

