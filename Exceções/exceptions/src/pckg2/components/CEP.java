package pckg2.components;

import pckg2.exceptions.BlankTextException;
import pckg2.exceptions.InvalidDataException;
import pckg2.exceptions.NegativeOrNullNumberException;

public class CEP {
    private final int code;
    private String street;
    private String district;
    private String city;
    private String state;

    public CEP (int code) throws InvalidDataException {
        if (code <= 0) {
            throw new NegativeOrNullNumberException();
        } else {
            if (String.valueOf(code).length() == 8) {
                this.code = code;
            } else {
                throw new InvalidDataException("O valor inserido não é um CEP válido.");
            }
        }
    }

    public CEP (int code, String street, String district, String city, String state) throws InvalidDataException {
        if (code <= 0) {
            throw new NegativeOrNullNumberException();
        } else {
            if (String.valueOf(code).length() == 8) {
                this.code = code;
            } else {
                throw new InvalidDataException("O valor inserido não é um CEP válido.");
            }
        }

        this.setStreet(street);
        this.setDistrict(district);
        this.setCity(city);
        this.setState(state);
    }

    public int getCode () {
        return this.code;
    }

    public String getStreet () {
        return this.street;
    }

    public void setStreet (String street) throws InvalidDataException {
        if (street.equals(null) || street.trim().equals("")) {
            throw new BlankTextException();
        } else {
            this.street = street;
        }
    }

    public String getDistrict () {
        return this.district;
    }

    public void setDistrict (String district) throws InvalidDataException {
        if (district.equals(null) || district.trim().equals("")) {
            throw new BlankTextException();
        } else {
            this.district = district;
        }
    }

    public String getCity () {
        return this.city;
    }

    public void setCity (String city) throws InvalidDataException {
        if (city.equals(null) || city.trim().equals("")) {
            throw new BlankTextException();
        } else {
            this.city = city;
        }
    }

    public String getState () {
        return this.state;
    }

    public void setState (String state) throws InvalidDataException {
        if (state.equals(null) || state.trim().equals("")) {
            throw new BlankTextException();
        } else {
            this.state = state;
        }
    }
}
