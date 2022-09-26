package pckg2;

public class SpecialCustomerLoyaltyClient extends CustomerLoyaltyClient {

    public SpecialCustomerLoyaltyClient () {}

    public SpecialCustomerLoyaltyClient (String name, String address, ClientInfo info, double bonus, String expirationDate) {
        super(name, address, info, bonus, expirationDate);
    }

    @Override
    public void addBonus (double value) {
        super.setBonus(super.getBonus() + (value * 0.1));
    }
}
