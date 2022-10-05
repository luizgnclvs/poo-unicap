package pckg3;

public class NaturalPersonInfo extends ClientInfo {
    private String CPF;
    private String RG;

    public NaturalPersonInfo () {}

    public NaturalPersonInfo (String CPF, String RG) {
        this.CPF = CPF;
        this.RG = RG;
    }

    public String getCPF () {
        return this.CPF;
    }

    public void setCPF (String CPF) {
        this.CPF = CPF;
    }

    public String getRG () {
        return this.RG;
    }

    public void setRG (String RG) {
        this.RG = RG;
    }
}
