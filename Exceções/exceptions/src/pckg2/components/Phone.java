package pckg2.components;

public class Phone {
    private final short DDI = 55;
    private DDD DDD;
    private int number;

    public Phone () {}

    public Phone (DDD DDD, int number) {
        this.DDD = DDD;
        this.number = number;
    }

    public short getDDI () {
        return this.DDI;
    }

    public DDD getDDD () {
        return this.DDD;
    }

    public void setDDD (DDD DDD) {
        this.DDD = DDD;
    }

    public int getNumber () {
        return this.number;
    }

    public void setNumber (int number) {
        this.number = number;
    }
}
