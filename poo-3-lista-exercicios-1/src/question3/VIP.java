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
        System.out.printf("O valor do ingresso é R$ %f.2" + (super.getValue() + this.additionalValue));
    }
}
