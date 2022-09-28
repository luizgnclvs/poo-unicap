package pckg3;

public class SpecialAccount extends Account {

    public SpecialAccount () {}

    public SpecialAccount (String clientName, int accountNumber, double balance, double clientSalary, double limit) {
        super(clientName, accountNumber, balance, clientSalary, limit);
    }

    @Override
    public void setLimit (double limit) {
        if (limit <= (this.getClientSalary() * 3)) {
            this.limit = limit;
        } else {
            System.out.println("O valor do limite não pode ser maior que três vezes o salário do cliente.");
        }
    }
}
