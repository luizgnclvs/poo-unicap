package question3;

public class VIP extends Ticket {
    private double additionalValue;

    public VIP () {}

    public VIP (double value, double additionalValue) {
        super(value);
        this.additionalValue = additionalValue;
    }

    public double getAdditionalValue () {
        return this.additionalValue;
    }

    public void setAdditionalValue (double additionalValue) {
        this.additionalValue = additionalValue;
    }

    @Override
    public void printValue () {
        System.out.printf("O ingresso custa R$ %,.2f", super.getValue() + this.additionalValue);
    }
}
