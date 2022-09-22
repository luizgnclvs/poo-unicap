package pckg;

public class Phone {
    private int ddd, number;

    public Phone () {}

    public Phone (int ddd, int number) {
        this.ddd = ddd;
        this.number = number;
    }

    public int getDDD () {
        return this.ddd;
    }

    public void setDDD (int ddd) {
        this.ddd = ddd;
    }

    public int getNumber () {
        return this.number;
    }

    public void setNumber (int number) {
        this.number = number;
    }
}
