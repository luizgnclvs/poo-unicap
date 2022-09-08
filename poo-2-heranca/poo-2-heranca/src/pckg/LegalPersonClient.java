package pckg;

public class LegalPersonClient extends Client {
    private long CNPJ;

    public LegalPersonClient () {}

    public LegalPersonClient (String name, Address address, long CNPJ) {
        super(name, address);
        this.CNPJ = CNPJ;
    }

    public long getCNPJ () {
        return this.CNPJ;
    }

    public void setCNPJ (long CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String toString () {
        return "Client " + this.getName() + ", of identification " + this.CNPJ + ", resided in " + this.getAddress().toString();
    }
}
