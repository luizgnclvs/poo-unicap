import java.util.ArrayList;

import exceptions.InsufficientBalanceException;
import exceptions.InvalidDataException;
import exceptions.NonexistentElementException;

public abstract class Account {
    final private Client owner;
	final private int agency;
	final private int number;
	final private int digit;
    private double balance;
	private ArrayList<String> transactions;

    public Account (Client owner, int agency) throws InvalidDataException {
        this.owner = owner;

        if (Services.isNumberLengthValid(agency, 4)) {
            this.agency = agency;
        } else {
            throw new InvalidDataException("O valor '" + agency + "' não é um número válido de agência.");
        }

        this.number = (int) Math.floor(Math.random() * (1000000 - 100000 + 1) + 100000);
        this.digit = (int) Math.floor(Math.random() * (9 - 1 + 1) + 1);
    }

    public Account (Client owner, int agency, double balance) throws InvalidDataException {
        this.owner = owner;

        if (Services.isNumberLengthValid(agency, 4)) {
            this.agency = agency;
        } else {
            throw new InvalidDataException("O valor '" + agency + "' não é um número válido de agência.");
        }

        this.number = (int) Math.floor(Math.random() * (1000000 - 100000 + 1) + 100000);
        this.digit = (int) Math.floor(Math.random() * (9 - 1 + 1) + 1);

        this.balance = balance;
    }

    public Client getOwner () {
        return this.owner;
    }

    public int getAgency () {
        return this.agency;
    }

    public int getNumber () {
        return this.number;
    }

    public int getDigit () {
        return this.digit;
    }

    public double getBalance () {
        return this.balance;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public ArrayList<String> getTransactions () {
        return this.transactions;
    }

    public void setTransactions (ArrayList<String> transactions) {
        this.transactions = transactions;
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

    public void transference (ArrayList<Account> accountRepository, int accountNumber, double value) throws InsufficientBalanceException, NonexistentElementException {
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
