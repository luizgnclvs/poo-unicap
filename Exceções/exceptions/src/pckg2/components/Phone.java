package pckg2.components;

import pckg2.exceptions.InvalidDataException;
import pckg2.exceptions.NegativeOrNullNumberException;

public class Phone {
    private int DDI;
    private int DDD;
    private int number;

    public Phone () {
        this.DDI = 55;
    }

    public Phone (int DDD, int number) {
        this.DDI = 55;
        this.DDD = DDD;
        this.number = number;
    }

    public int getDDI () {
        return this.DDI;
    }

    public void setDDI (int DDI) throws InvalidDataException {
        if (DDI <= 0) {
            throw new NegativeOrNullNumberException();
        } else {
            if ((Services.isNumberLengthValid(DDI, 1) || Services.isNumberLengthValid(DDI, 2)) || Services.isNumberLengthValid(DDI, 3)) {
                this.DDI = DDI;
            } else {
                throw new InvalidDataException("O valor inserido não é um DDi válido.");
            }
        }
    }

    public int getDDD () {
        return this.DDD;
    }

    public void setDDD (int DDD) throws InvalidDataException {
        if (DDD <= 0) {
            throw new NegativeOrNullNumberException();
        } else {
            if (Services.isNumberLengthValid(DDD, 2)) {
                this.DDD = DDD;
            } else {
                throw new InvalidDataException("O valor inserido não é um DDD válido.");
            }
        }
    }

    public int getNumber () {
        return this.number;
    }

    public void setNumber (int number) throws InvalidDataException {
        if (number <= 0) {
            throw new NegativeOrNullNumberException();
        } else {
            if (Services.isNumberLengthValid(number, 8) || Services.isNumberLengthValid(number, 9)) {
                this.number = number;
            } else {
                throw new InvalidDataException("O valor inserido não é um número telefônico válido.");
            }
        }
    }

    public String toString () {
        return "+" + this.DDI + " (" + this.DDD + ") " + this.number;
    }
}
