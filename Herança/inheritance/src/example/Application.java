package example;

public class Application {

    public static void print (Client client) {
        System.out.println("Nome: " + client.getName());
        System.out.println("Endereço: " + client.getAddress());

        if (client instanceof NaturalPersonClient) {
            System.out.println("CPF: " + ((NaturalPersonClient)client).getCPF());
        }

        if (client instanceof LegalPersonClient) {
            System.out.println("CNPJ: " + ((LegalPersonClient)client).getCNPJ());
        }
    }

    public static void main(String[] args) {
        Client naturalPerson = new NaturalPersonClient("Luiz", "Rua Lampkin Lane, 1978", "123.456.789-00");
        Client legalPerson = new LegalPersonClient("Felipe LTDA.", "Rua Neibolt, 29", "12.345.678/9999-00");

        System.out.println();
        print(naturalPerson);

        System.out.println();
        print(legalPerson);
    }
}
