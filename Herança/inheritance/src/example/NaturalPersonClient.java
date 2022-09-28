package example;

public class NaturalPersonClient extends Client {
    private String CPF;

    public NaturalPersonClient () {}

    public NaturalPersonClient (String name, String address, String CPF) {
        super(name, address);
        this.CPF = CPF;
    }

    public String getCPF () {
        return this.CPF;
    }

    public void setCPF (String CPF) {
        this.CPF = CPF;
    }
}
