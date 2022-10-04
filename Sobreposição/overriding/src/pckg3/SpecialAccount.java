package pckg3;

public class SpecialAccount extends Account {

    public SpecialAccount () {}

    public SpecialAccount (String clientName, int accountNumber, double balance, double clientSalary, double limit) {
        super(clientName, accountNumber, balance, clientSalary, limit);
    }

    @Override
    public boolean isLimitValid (double limit) {
        if (limit <= (super.getClientSalary() * 3)) {
            return true;
        } else {
            return false;
        }
    }
}
