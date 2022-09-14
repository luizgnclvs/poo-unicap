package question3;

public class Regular extends Ticket {

    public Regular () {}

    public Regular (double value) {
        super(value);
    }

    public void printTicket () {
        System.out.println("Ingresso Normal");
    }
}
