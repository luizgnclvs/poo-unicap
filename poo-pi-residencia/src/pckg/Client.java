package pckg;

import java.util.List;

public class Client {
    private int id;
    private String name;
    private Phone phone;
    private Address address;
    private List<Card> wallet;
    private List<Product> shoppingCart;

    public Client () {}

    public Client (int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId () {
        return this.id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getName () {
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public Phone getPhone () {
        return this.phone;
    }

    public void setPhone (Phone phone) {
        this.phone = phone;
    }

    public Address getAddress () {
        return this.address;
    }

    public void setAddress (Address address) {
        this.address = address;
    }

    public List<Card> getWallet () {
        return this.wallet;
    }

    public void setWallet (List<Card> wallet) {
        this.wallet = wallet;
    }

    public List<Product> getShoppingCart () {
        return this.shoppingCart;
    }

    public void setShoppingCart (List<Product> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void addToShoppingCart (Product product) { //should be a boolean method
        this.shoppingCart.add(product);
    }

    public void removeFromShoppingCart (Product product) { //should be boolean as well
        this.shoppingCart.remove(product);
    }

    public void makePayment (Card card, int installments) { //should also be boolean
        double totalValue = 0;

        for (int i = 0; i < this.shoppingCart.size(); i++) {
            totalValue += this.shoppingCart.get(i).getValue();
        }

        Date datetime = new Date(); //methods for acquiring the current datetime

        Payment payment = new Payment(totalValue, installments, datetime, card);

        //procces info according to company's specs

        this.shoppingCart.clear();
    }
}
