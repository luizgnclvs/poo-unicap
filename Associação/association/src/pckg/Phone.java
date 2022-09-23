package pckg;

public class Phone {
    private int DDD, number;

    public Phone () {}

    public Phone (int DDD, int number) {
        this.DDD = DDD;
        this.number = number;
    }

    public int getDDD () {
        return this.DDD;
    }

    public void setDDD (int DDD) {
        this.DDD = DDD;
    }

    public int getNumber () {
        return this.number;
    }

    public void setNumber (int number) {
        this.number = number;
    }
}
