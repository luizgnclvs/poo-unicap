import java.util.ArrayList;
import java.util.List;

import exceptions.InsufficientBalanceException;
import exceptions.InvalidDataException;
import exceptions.NonexistentElementException;

public abstract class Account {
    private final Client owner;
	private final List<String> transactions = new ArrayList<String>();
	private final int number = (int) Math.floor(Math.random() * (1000000 - 100000 + 1) + 100000);
	private final int digit = (int) Math.floor(Math.random() * (9 - 1 + 1) + 1);
	private final int agency;
    private double balance;

    public Account (Client owner, int agency) throws InvalidDataException {
        this.owner = owner;

        if (Services.isNumberLengthValid(agency, 4)) {
            this.agency = agency;
        } else {
            throw new InvalidDataException("O valor '" + agency + "' não é um número válido de agência.");
        }
    }

    public Account (Client owner, int agency, double balance) throws InvalidDataException {
        this.owner = owner;

        if (Services.isNumberLengthValid(agency, 4)) {
            this.agency = agency;
        } else {
            throw new InvalidDataException("O valor '" + agency + "' não é um número válido de agência.");
        }

        this.balance = balance;
    }

    public Client getOwner () {
        return this.owner;
    }

    public List<String> getTransactions () {
        return this.transactions;
    }

    public int getNumber () {
        return this.number;
    }

    public int getDigit () {
        return this.digit;
    }

    public int getAgency () {
        return this.agency;
    }

    public double getBalance () {
        return this.balance;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public void deposit (double value) {
        this.addBalance(value);
        recordTransaction("DEPÓSITO", value);
    }

    public double withdraw (double value) throws InsufficientBalanceException {
        this.subtractBalance(value);
        recordTransaction("SAQUE", (value * -1));

        return value;
    }

    public void transference (List<Account> accountRepository, int accountNumber, double value) throws InsufficientBalanceException, NonexistentElementException {
        boolean isThereAccount = false;

        for (Account account : accountRepository) {
            if (account.getNumber() == accountNumber) {
                isThereAccount = true;

                this.subtractBalance(value); // Checando se a conta possui o valor a ser transferido.
                account.addBalance(value);

                this.recordTransaction((value * -1), accountNumber);
                account.recordTransaction(value, this.number);
            }
        }

        if (!isThereAccount) {
            throw new NonexistentElementException();
        }
    }

    private void recordTransaction (String operation, double value) {
        this.transactions.add("#" + (this.transactions.size() + 1) + ": " + operation + " || R$ " + value);
    }

    private void recordTransaction (double value, int accountNumber) {
        this.transactions.add("#" + (this.transactions.size() + 1) + " -  TRANSFERÊNCIA{" + accountNumber + "} // R$ " + value);
    }

    private void addBalance (double value) {
        this.setBalance(this.balance + value);
    }

    private void subtractBalance (double value) throws InsufficientBalanceException {
        if (value < this.balance) {
            this.setBalance(this.balance - value);
        } else {
            throw new InsufficientBalanceException();
        }
    }
}
