package pckg;

public class Product {
    private int id;
    private String name;
    private double value;
    private boolean availability;

    public Product () {}

    public Product (int id, String name, double value, boolean availability) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.availability = availability;
    }

    public int getId () {
        return this.id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getName () {
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public double getValue () {
        return this.value;
    }

    public void setValue (double value) {
        this.value = value;
    }

    public boolean getAvailability () {
        return this.availability;
    }

    public void setAvailability (boolean availability) {
        this.availability = availability;
    }
}
