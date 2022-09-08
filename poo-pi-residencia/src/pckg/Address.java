package pckg;

public class Address {
    private int cep, number;
    private String street, district, city, state, complement;

    public Address () {}

    public Address (int cep, int number) {
        this.cep = cep;
        this.number = number;
    }

    public Address (int cep, int number, String street, String district, String city, String state) {
        this.cep = cep;
        this.number = number;
        this.street = street;
        this.district = district;
        this.city = city;
        this.state = state;
    }

    public Address (int cep, int number, String complement) {
        this.cep = cep;
        this.number = number;
        this.complement = complement;
    }

    public Address (int cep, int number, String street, String district, String city, String state, String complement) {
        this.cep = cep;
        this.number = number;
        this.street = street;
        this.district = district;
        this.city = city;
        this.state = state;
        this.complement = complement;
    }

    public int getCEP () {
        return this.cep;
    }

    public void setCEP (int cep) {
        this.cep = cep;
    }

    public int getNumber () {
        return this.number;
    }

    public void setNumber (int number) {
        this.number = number;
    }

    public String getStreet () {
        return this.street;
    }

    public void setStreet (String street) {
        this.street = street;
    }

    public String getDistrict () {
        return this.district;
    }

    public void setDistrict (String district) {
        this.district = district;
    }

    public String getCity () {
        return this.city;
    }

    public void setCity (String city) {
        this.city = city;
    }

    public String getState () {
        return this.state;
    }

    public void setState (String state) {
        this.state = state;
    }

    public String getComplement () {
        return this.complement;
    }

    public void setComplement (String complement) {
        this.complement = complement;
    }
}
