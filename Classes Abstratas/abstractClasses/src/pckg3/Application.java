package pckg3;

public class Application {

    public static void print (Client client) {
        System.out.println("Nome: " + client.getName());
        System.out.println("Endereço: " + client.getAddress());

        if (client.getInfo() instanceof NaturalPersonInfo) {
            System.out.println("CPF: " + ((NaturalPersonInfo)client.getInfo()).getCPF());
            System.out.println("RG: " + ((NaturalPersonInfo)client.getInfo()).getRG());
        }

        if (client.getInfo() instanceof LegalPersonInfo) {
            System.out.println("CNPJ: " + ((LegalPersonInfo)client.getInfo()).getCNPJ());
        }
    }

    public static void main(String[] args) {
        Client naturalPerson = new Client("Luiz", "Rua Lampkin Lane, 1978", "123.456.789-00", "1.222.333");
        Client legalPerson = new Client("Felipe LTDA.", "Rua Neibolt, 29", "12.345.678/9999-00");

        System.out.println();
        print(naturalPerson);

        System.out.println();
        print(legalPerson);
    }
}
