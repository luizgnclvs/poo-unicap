package pckg2.components;

import pckg2.Services;
import pckg2.exceptions.BlankTextException;
import pckg2.exceptions.InvalidDataException;
import pckg2.exceptions.NegativeOrNullNumberException;

public class CEP {
    private int code;
    private String street;
    private String district;
    private String city;
    private State state;

    public CEP () {}

    public CEP (int code) throws InvalidDataException {
        this.setCode(code);
    }

    public CEP (int code, String street, String district, String city, State state) throws InvalidDataException {
        this.setCode(code);
        this.setStreet(street);
        this.setDistrict(district);
        this.setCity(city);
        this.setState(state);
    }

    public int getCode () {
        return this.code;
    }

    public void setCode (int code) throws InvalidDataException {
        if (code <= 0) {
            throw new NegativeOrNullNumberException();
        } else {
            if (Services.isNumberLengthValid(code, 8)) {
                this.code = code;
            } else {
                throw new InvalidDataException("O valor inserido não é um CP válido");
            }
        }
    }

    public String getStreet () {
        return this.street;
    }

    public void setStreet (String street) throws InvalidDataException {
        if (Services.isStringValid(street)) {
            throw new BlankTextException();
        } else {
            this.street = street;
        }
    }

    public String getDistrict () {
        return this.district;
    }

    public void setDistrict (String district) throws InvalidDataException {
        if (Services.isStringValid(district)) {
            throw new BlankTextException();
        } else {
            this.district = district;
        }
    }

    public String getCity () {
        return this.city;
    }

    public void setCity (String city) throws InvalidDataException {
        if (Services.isStringValid(city)) {
            throw new BlankTextException();
        } else {
            this.city = city;
        }
    }

    public State getState () {
        return this.state;
    }

    public void setState (State state) {
        this.state = state;
    }
}
