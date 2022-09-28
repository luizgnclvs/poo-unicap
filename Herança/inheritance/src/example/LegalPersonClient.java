package example;

public class LegalPersonClient extends Client {
    private String CNPJ;

    public LegalPersonClient () {}

    public LegalPersonClient (String name, String address, String CNPJ) {
        super(name, address);
        this.CNPJ = CNPJ;
    }

    public String getCNPJ () {
        return this.CNPJ;
    }

    public void setCNPJ (String CNPJ) {
        this.CNPJ = CNPJ;
    }
}
