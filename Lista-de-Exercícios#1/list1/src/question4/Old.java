package question4;

public class Old extends RealEstate {
    private double discount;

    public Old () {}

    public Old (String address, double price, double discount) {
        super(address, price);
        this.discount = discount;
    }

    public double getDiscount () {
        return this.discount;
    }

    public void setDiscount (double discount) {
        this.discount = discount;
    }

    public void printPrice () {
        System.out.printf("O preço final do imóvel é de R$ %,.2f", super.getPrice() - this.discount);
    }
}
