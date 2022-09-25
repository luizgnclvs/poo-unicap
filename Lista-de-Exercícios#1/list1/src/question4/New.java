package question4;

public class New extends RealEstate {
    private double additional;

    public New () {}

    public New (String address, double price, double additional) {
        super(address, price);
        this.additional = additional;
    }

    public double getAdditional () {
        return this.additional;
    }

    public void setAdditional (double additional) {
        this.additional = additional;
    }

    public void printPrice () {
        System.out.printf("O preço final do imóvel é R$ %,.2f", super.getPrice() + this.additional);
    }
}
