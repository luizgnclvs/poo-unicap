package pckg;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            System.out.println("\nOlá! Seja bem-vindo(a).\n\nVamos iniciar seu cadastro.\nInsira suas informações conforme requisitado.\n");

            Client client = new Client();

            System.out.print("Nome: ");
            client.setName(read.nextLine());
            System.out.print("RG: ");
            client.setRG(read.nextInt());
            System.out.print("CPF: ");
            client.setCPF(read.nextLong());

            Phone phone = new Phone();

            System.out.print("\nTELEFONE\nDDD: ");
            phone.setDDD(read.nextInt());
            System.out.print("Número: ");
            phone.setNumber(read.nextInt());

            client.setPhone(phone);

            Date dateOfBirth = new Date();

            System.out.print("\nDATA DE NASCIMENTO\nDia: ");
            dateOfBirth.setDay(read.nextInt());
            System.out.print("Mês: ");
            dateOfBirth.setMonth(read.nextInt());
            System.out.print("Ano: ");
            dateOfBirth.setYear(read.nextInt());
            read.nextLine();

            client.setDateOfBirth(dateOfBirth);

            Address address = new Address();

            System.out.print("\nENDEREÇO\nLogradouro: ");
            address.setStreet(read.nextLine());
            System.out.print("Número: ");
            address.setNumber(read.nextInt());
            read.nextLine();
            System.out.print("Bairro: ");
            address.setBorough(read.nextLine());
            System.out.print("Cidade: ");
            address.setCity(read.nextLine());
            System.out.print("Estado: ");
            address.setState(read.nextLine());

            client.setAddress(address);
            
            System.out.printf(
                "\n\n%s\n%s: %s\n%s: %d\n%s: %d\n\n%s: (%d) %d\n\n%s: %d/%d/%d\n\n%s:\n%s, %d\n%s, %s - %s",
                "DADOS INSERIDOS",
                "Nome", client.getName(),
                "RG", client.getRG(),
                "CPF", client.getCPF(),
                "Telefone", client.getPhone().getDDD(), client.getPhone().getNumber(),
                "Data de Nascimento", client.getDateOfBirth().getDay(), client.getDateOfBirth().getMonth(), client.getDateOfBirth().getYear(),
                "Endereço", client.getAddress().getStreet(), client.getAddress().getNumber(),
                client.getAddress().getBorough(), client.getAddress().getCity(), client.getAddress().getState()
            );
        }
    }
}
