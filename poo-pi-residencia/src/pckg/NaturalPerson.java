package pckg;

public class NaturalPerson extends Client {
    private long cpf;
    private int rg;

    public NaturalPerson () {}

    public NaturalPerson (int id, String name, long cpf, int rg) {
        super(id, name);
        this.cpf = cpf;
        this.rg = rg;
    }

    public long getCPF () {
        return this.cpf;
    }

    public void setCPF (long cpf) {
        this.cpf = cpf;
    }

    public int getRG () {
        return this.rg;
    }

    public void setRG (int rg) {
        this.rg = rg;
    }
}
