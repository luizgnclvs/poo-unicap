package pckg2;

public class Test {

    public static void main(String[] args) {
        double bonus = 155.50;
        double value = 275.90;

        ClientInfo info1 = new NaturalPersonClientInfo("111.222.333-44");
        ClientInfo info2 = new NaturalPersonClientInfo("123.456.789.-00");

        CustomerLoyaltyClient client = new CustomerLoyaltyClient(
            "Luiz", "Rua 1", info1, bonus, "25/01/2023"
        );

        CustomerLoyaltyClient specialClient = new SpecialCustomerLoyaltyClient(
            "Felipe", "Avenida 2", info2, bonus, "25/12/2022"
        );

        client.addBonus(value);
        specialClient.addBonus(value);

        System.out.println(client.getBonus());
        System.out.println(specialClient.getBonus());
    }
}
