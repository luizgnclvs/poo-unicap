package pckg;

public class LegalPerson extends Client {
    private long cnpj;
    private String corporateName;

    public LegalPerson () {}

    public LegalPerson (int id, String nome, long cnpj, String corporateName) {
        super(id, nome);
        this.cnpj = cnpj;
        this.corporateName = corporateName;
    }

    public long getCNPJ () {
        return this.cnpj;
    }

    public void setCNPJ (long cnpj) {
        this.cnpj = cnpj;
    }

    public String getCorporateName () {
        return this.corporateName;
    }

    public void setCorporateName (String corporateName) {
        this.corporateName = corporateName;
    }
}
