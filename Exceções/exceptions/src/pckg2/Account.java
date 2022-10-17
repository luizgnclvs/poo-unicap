package pckg2;

import pckg2.exceptions.InvalidDataException;
import pckg2.exceptions.NegativeOrNullNumberException;

public class Account {
    private final int number;
    private double balance;
    private double limit;
    private Client client;

    public static boolean isAccountNumberValid (int accountNumber) {
        if (String.valueOf(accountNumber).length() == 8) {
            return true;
        } else {
            return false;
        }
    }

    public Account (int number) throws InvalidDataException {
        if (number <= 0) {
            throw new NegativeOrNullNumberException();
        } else {
            if (isAccountNumberValid(number)) {
                this.number = number;
            } else {
                throw new InvalidDataException("O valor inserido não é um número de conta válido.");
            }
        }
    }

    public Account (int number, double balance, double limit) throws InvalidDataException {
        if (number <= 0) {
            throw new NegativeOrNullNumberException();
        } else {
            if (isAccountNumberValid(number)) {
                this.number = number;
            } else {
                throw new InvalidDataException("O valor inserido não é um número de conta válido.");
            }
        }

        this.balance = balance;
        this.setLimit(limit);
    }

    public Account (int number, double balance, double limit, Client client) throws InvalidDataException {
        if (number <= 0) {
            throw new NegativeOrNullNumberException();
        } else {
            if (isAccountNumberValid(number)) {
                this.number = number;
            } else {
                throw new InvalidDataException("O valor inserido não é um número de conta válido.");
            }
        }

        this.balance = balance;
        this.setLimit(limit);
        this.client = client;
    }

    public int getNumber () {
        return this.number;
    }

    public double getBalance () {
        return this.balance;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public double getLimit () {
        return this.limit;
    }

    public void setLimit (double limit) throws InvalidDataException {
        if (limit <= 0) {
            throw new NegativeOrNullNumberException();
        } else {
            if (limit > this.client.getSalary()) {
                throw new InvalidDataException("O limite da conta não pode ser maior que o salário do cliente.");
            } else {
                this.limit = limit;
            }
        }
    }

    public Client getClient () {
        return this.client;
    }

    public void setClient (Client client) {
        this.client = client;
    }
}
