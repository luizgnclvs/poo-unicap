package pckg;

public class NaturalPersonClient extends Client {
    private long CPF;

    public NaturalPersonClient () {}

    public NaturalPersonClient (String name, Address address, long CPF) {
        super(name, address);
        this.CPF = CPF;
    }

    public long getCPF () {
        return this.CPF;
    }

    public void setCPF (long CPF) {
        this.CPF = CPF;
    }

    public String toString () {
        return "Client " + this.getName() + ", of identification " + this.CPF + ", resided in " + this.getAddress().toString();
    }
}
