package pckg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Rua Street", 444, "Bairro", "Cidade", "Estado");
        Address address2 = new Address();


        NaturalPersonClient naturalPerson = new NaturalPersonClient();



        // Scanner read = new Scanner(System.in);

        // System.out.println("Olá! Vamos iniciar o cadastro de clientes.");
        // System.out.println("Insira 'X' no campo 'Nome' se quiser interromper o processo.\n");

        // while (true) {
        //     System.out.print("Nome do cliente: ");
        //     String name = read.nextLine();

        //     if (name.equalsIgnoreCase("X")) {
        //         break;
        //     }

        //     Address address = new Address();

        //     System.out.print("\nENDEREÇO\nLogradouro: ");
        //     address.setName(read.nextLine());
        //     System.out.print("Número: ");
        //     address.setNumber(read.nextInt());
        //     read.nextLine();
        //     System.out.print("Bairro: ");
        //     address.setDistrict(read.nextLine());
        //     System.out.print("Cidade: ");
        //     address.setCity(read.nextLine());
        //     System.out.print("Estado: ");
        //     address.setState(read.nextLine());

        //     System.out.print("\nDigite '1' se o cliente for pessoa física ou '2' se for pessoa jurídica: ");
        //     int entry = read.nextInt();

        //     while (entry > 2 || entry < 1) {
        //         System.out.print("Opção inválida! Tente novamente: ");
        //         entry = read.nextInt();
        //     }

        //     if (entry == 1) {
        //         System.out.print("Insira o CPF do cliente: ");
        //     } else {
        //         System.out.print("Insira o CNPJ do cliente: ");
        //     }

        //     long id = read.nextLong();

        //     if ()
        // }
    }
}
