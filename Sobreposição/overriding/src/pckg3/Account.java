package pckg3;

public class Account {
    private String clientName;
    private int accountNumber;
    private double balance;
    private double clientSalary;
    private double limit;

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
        if (this.getClass().getSimpleName().equals("Account")) {
            if (limit <= this.clientSalary) {
                this.limit = limit;
            } else {
                System.out.println("O valor do limite não pode ser maior que o salário do cliente.");
            }
        } else {
            if (limit <= (this.clientSalary * 3)) {
                this.limit = limit;
            } else {
                System.out.println("O valor do limite não pode ser maior que três vezes o salário do cliente.");
            }
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
