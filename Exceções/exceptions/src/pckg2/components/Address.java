package pckg2.components;

import pckg2.exceptions.InvalidDataException;
import pckg2.exceptions.NegativeOrNullNumberException;

public class Address {
    private CEP CEP;
    private int number;
    private String complement;

    public Address () {}

    public Address (CEP CEP, int number) throws InvalidDataException {
        this.setCEP(CEP);
        this.setNumber(number);
    }

    public Address (CEP CEP, int number, String complement) throws InvalidDataException {
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

    public int getNumber () {
        return this.number;
    }

    public void setNumber (int number) throws InvalidDataException {
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

    public String toString () {
        if (Services.isStringValid(this.complement)) {
            return this.CEP.getCode() + " - " + this.CEP.getStreet() + ", " + this.number + "\n" + this.CEP.getDistrict() + ",\n" + this.CEP.getCity() + " - " + this.CEP.getState().name();
        } else {
            return this.CEP.getCode() + " - " + this.CEP.getStreet() + ", " + this.number + " - " + this.complement + "\n" + this.CEP.getDistrict() + ", " + this.CEP.getCity() + " - " + this.CEP.getState().name();
        }
    }
}
