package pckg3;

public class Account {
    private String clientName;
    private int accountNumber;
    private double balance;
    private double clientSalary;
    protected double limit;

    public Account () {}

    public Account (String clientName, int accountNumber, double balance,  double clientSalary, double limit) {
        this.clientName = clientName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.clientSalary = clientSalary;
        this.setLimit(limit);
    }

    public String getClientName () {
        return this.clientName;
    }

    public void setClientName (String clientName) {
        this.clientName = clientName;
    }

    public int getAccountNumber () {
        return this.accountNumber;
    }

    public void setAccountNumber (int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance () {
        return this.balance;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public double getClientSalary () {
        return this.clientSalary;
    }

    public void setClientSalary (double clientSalary) {
        this.clientSalary = clientSalary;
    }

    public double getLimit () {
        return this.limit;
    }

    public void setLimit (double limit) {
        if (this.isLimitValid(limit)) {
            this.limit = limit;
        } else {
            System.out.println("Valor do limite é inválido.");
        }
    }

    public boolean isLimitValid (double limmit) {
        if (limit <= this.clientSalary) {
            return true;
        } else {
            return false;
        }
    }

    public void deposit (double value) {
        this.balance += value;
    }

    public boolean withdraw (double value) {
        if (value > this.balance) {
            return false;
        } else {
            this.balance -= value;

            return true;
        }
    }
}
