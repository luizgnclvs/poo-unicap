import exceptions.InvalidDataException;
import exceptions.NegativeOrNullNumberException;

public class SavingsAccount extends Account {
    private double rentability;

    public SavingsAccount (Client owner, int agency) throws InvalidDataException {
        super(owner, agency);
    }

    public SavingsAccount (Client owner, int agency, double balance, double rentability) throws InvalidDataException {
        super(owner, agency, balance);
        this.setRentability(rentability);
    }

    public double getRentability() {
        return this.rentability;
    }

    public void setRentability(double rentability) throws InvalidDataException {
        if (rentability <= 0) {
            throw new NegativeOrNullNumberException();
        } else {
            this.rentability = rentability;
        }
    }
}
