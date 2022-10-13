package pckg2.components;

import pckg2.exceptions.InvalidDataException;
import pckg2.exceptions.NegativeOrNullNumberException;

public class Address {
    private CEP CEP;
    private short number;
    private String complement;

    public Address () {}

    public Address (CEP CEP, short number) throws InvalidDataException {
        this.setCEP(CEP);
        this.setNumber(number);
    }

    public Address (CEP CEP, short number, String complement) throws InvalidDataException {
        this.setCEP(CEP);
        this.setNumber(number);
        this.setComplement(complement);
    }

    public CEP getCEP () {
        return this.CEP;
    }

    public void setCEP (CEP CEP) {
        this.CEP = CEP;
    }

    public short getNumber () {
        return this.number;
    }

    public void setNumber (short number) throws InvalidDataException {
        if (number <= 0) {
            throw new NegativeOrNullNumberException();
        } else {
            this.number = number;
        }
    }

    public String getComplement () {
        return this.complement;
    }

    public void setComplement (String complement) {
        this.complement = complement;
    }
}
