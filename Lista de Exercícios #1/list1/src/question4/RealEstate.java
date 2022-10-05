package question4;

public class RealEstate {
    private String address;
    private double price;

    public RealEstate () {}

    public RealEstate (String address, double price) {
        this.address = address;
        this.price = price;
    }

    public String getAddress () {
        return this.address;
    }

    public void setAddress (String address) {
        this.address = address;
    }

    public double getPrice () {
        return this.price;
    }

    public void setPrice (double price) {
        this.price = price;
    }
}
