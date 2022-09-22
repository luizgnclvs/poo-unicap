package question3;

public class Ticket {
    private double value;

    public Ticket () {}

    public Ticket (double value) {
        this.value = value;
    }

    public double getValue () {
        return this.value;
    }

    public void setValue (double value) {
        this.value = value;
    }

    public void printValue () {
        System.out.printf("O valor do ingresso é R$ %,.2f", this.value);
    }
}
