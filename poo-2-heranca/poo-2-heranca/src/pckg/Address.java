package pckg;

public class Address {
    private String name, district, city, state;
    private int number;

    public Address () {}

    public Address (String name, int number, String district, String city, String state) {
        this.name = name;
        this.number = number;
        this.district = district;
        this.city = city;
        this.state = state;
    }

    public String getName () {
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }
    
    public int getNumber () {
        return this.number;
    }

    public void setNumber (int number) {
        this.number = number;
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

    public String toString () {
        return this.name + " " + Integer.toString(this.number) + ", " + this.district + " - " + this.city + ", " + this.state;
    }
}