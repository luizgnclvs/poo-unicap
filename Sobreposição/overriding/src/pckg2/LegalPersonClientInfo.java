package pckg2;

public class LegalPersonClientInfo extends ClientInfo {
    private String CNPJ;

    public LegalPersonClientInfo () {}

    public LegalPersonClientInfo (String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getCNPJ () {
        return this.CNPJ;
    }

    public void setCNPJ (String CNPJ) {
        this.CNPJ = CNPJ;
    }
}
