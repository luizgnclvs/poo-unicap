import exceptions.BlankTextException;
import exceptions.InvalidDataException;
import exceptions.NegativeOrNullNumberException;

public class CEP {
    private int code;
    private String street;
    private String district;
    private String city;
    private String state;

    public CEP () {}

    public CEP (int code) throws InvalidDataException {
        this.setCode(code);
    }

    public CEP (int code, String street, String district, String city, String state) throws InvalidDataException {
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
                throw new InvalidDataException("O valor '" + code + "' não é um CEP válido");
            }
        }
    }

    public String getStreet () {
        return this.street;
    }

    public void setStreet (String street) throws InvalidDataException {
        if (Services.isStringValid(street)) {
            this.street = street;
        } else {
            throw new BlankTextException();
        }
    }

    public String getDistrict () {
        return this.district;
    }

    public void setDistrict (String district) throws InvalidDataException {
        if (Services.isStringValid(district)) {
            this.district = district;
        } else {
            throw new BlankTextException();
        }
    }

    public String getCity () {
        return this.city;
    }

    public void setCity (String city) throws InvalidDataException {
        if (Services.isStringValid(city)) {
            this.city = city;
        } else {
            throw new BlankTextException();
        }
    }

    public String getState () {
        return this.state;
    }

    public void setState (String state) throws InvalidDataException {
        if (Services.isStringValid(state)) {
            this.state = state;
        } else {
            throw new BlankTextException();
        }
    }
}
