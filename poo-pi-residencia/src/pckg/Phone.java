package pckg;

public class Phone {
    private int ddi, ddd;
    private long number;

    public Phone () {}

    public Phone (int ddi, int ddd, long number) {
        this.ddi = ddi;
        this.ddd = ddd;
        this.number = number;
    }

    public int getDDI () {
        return this.ddi;
    }

    public void setDDI (int ddi) {
        this.ddi = ddi;
    }

    public int getDDD () {
        return this.ddd;
    }

    public void setDDD (int ddd) {
        this.ddd = ddd;
    }

    public long getNumber () {
        return this.number;
    }

    public void setNumber (long number) {
        this.number = number;
    }
}
