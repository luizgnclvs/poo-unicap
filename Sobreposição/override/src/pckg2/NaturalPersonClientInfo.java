package pckg2;

public class NaturalPersonClientInfo extends ClientInfo {
    private String CPF;

    public NaturalPersonClientInfo () {}

    public NaturalPersonClientInfo (String CPF) {
        this.CPF = CPF;
    }

    public String getCPF () {
        return this.CPF;
    }

    public void setCPF (String CPF) {
        this.CPF = CPF;
    }
}
