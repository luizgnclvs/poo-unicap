package pckg;

public class Address {
    private String street, borough, city, state;
    private int number;

    public Address () {}

    public Address (String street, int number, String borough, String city, String state) {
        this.street = street;
        this.number = number;
        this.borough = borough;
        this.city = city;
        this.state = state;
    }

    public String getStreet () {
        return this.street;
    }

    public void setStreet (String street) {
        this.street = street;
    }
    
    public int getNumber () {
        return this.number;
    }

    public void setNumber (int number) {
        this.number = number;
    }

    public String getBorough () {
        return this.borough;
    }

    public void setBorough (String borough) {
        this.borough = borough;
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
}
