package pckg;

public class Client {
    private String name;
    private Address address;

    public Client () {}

    public Client (String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName () {
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public Address getAddress () {
        return this.address;
    }

    public void setAddress (Address address) {
        this.address = address;
    }
}