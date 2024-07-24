package stockMarket;

public class User {
    private String username;
    private String password;
    private double cashBalance;
    private Portfolio portfolio;

    public User(String username, String password, double initialBalance) {
        this.username = username;
        this.password = password;
        this.cashBalance = initialBalance;
        this.portfolio = new Portfolio();
    }

    public String getUsername() {
        return username;
    }

    public boolean authenticate(String password) {
        return this.password.equals(password);
    }

    public double getCashBalance() {
        return cashBalance;
    }

    public void updateCashBalance(double amount) {
        this.cashBalance += amount;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }
}

