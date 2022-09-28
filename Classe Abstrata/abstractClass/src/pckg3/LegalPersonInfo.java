package pckg3;

public class LegalPersonInfo extends ClientInfo {
    private String CNPJ;

    public LegalPersonInfo () {}

    public LegalPersonInfo (String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getCNPJ () {
        return this.CNPJ;
    }

    public void setCNPJ (String CNPJ) {
        this.CNPJ = CNPJ;
    }
}
