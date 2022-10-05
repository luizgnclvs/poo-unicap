package pckg2;

public class CustomerLoyaltyClient extends Client {
    private double bonus;
    private String expirationDate;

    public CustomerLoyaltyClient () {}

    public CustomerLoyaltyClient (String name, String address, ClientInfo info, double bonus, String expirationDate) {
        super(name, address, info);
        this.bonus = bonus;
        this.expirationDate = expirationDate;
    }

    public double getBonus () {
        return this.bonus;
    }

    public void setBonus (double bonus) {
        this.bonus = bonus;
    }

    public String getExpirationDate () {
        return this.expirationDate;
    }

    public void setExpirationDate (String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void addBonus (double value) {
        this.bonus += value * 0.05;
    }
}
