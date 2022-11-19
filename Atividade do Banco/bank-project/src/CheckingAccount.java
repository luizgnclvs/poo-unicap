import exceptions.InvalidDataException;

public class CheckingAccount extends Account {
    public CheckingAccount (Client owner, int agency) throws InvalidDataException {
        super(owner, agency);
    }

    public CheckingAccount (Client owner, int agency, double balance) throws InvalidDataException {
        super(owner, agency, balance);
    }
}
