package pckg;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Olá! Seja bem-vindo(a).\n\nVamos iniciar seu cadastro.\nInsira suas informações conforme requisitado.\n");

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
        Date birthday = new Date();

        System.out.print("\nDATA DE NASCIMENTO\nDia: ");
        birthday.setDay(read.nextInt());
        System.out.print("Mês: ");
        birthday.setMonth(read.nextInt());
        System.out.print("Ano: ");
        birthday.setYear(read.nextInt());

        client.setBirthday(birthday);
        Address address = new Address();

        System.out.print("\nENDEREÇO\nLogradouro: ");
        address.setName(read.nextLine());
        System.out.print("Número: ");
        address.setNumber(read.nextInt());
        System.out.print("Bairro: ");
        address.setDistrict(read.nextLine());
        System.out.print("Cidade: ");
        address.setCity(read.nextLine());
        System.out.print("Estado: ");
        address.setState(read.nextLine());

        client.setAddress(address);
        
        System.out.printf("\n\n%s\n%s: %s\n%s: %d\t%s: %d\n\n%s: (%d) %d\n\n%s: %d/%d/%d\n\n%s:\n%s, %d\n%s, %s - %s",
        "DADOS INSERIDOS", "Nome", client.getName(), "RG", client.getRG(), "CPF", client.getCPF(),
        "Telefone", client.getPhone().getDDD(), client.getPhone().getNumber(),
        "Data de Nascimento", client.getBirthday().getDay(), client.getBirthday().getMonth(), client.getBirthday().getYear(),
        "Endereço", client.getAddress().getName(), client.getAddress().getNumber(), client.getAddress().getDistrict(), client.getAddress().getCity(), client.getAddress().getState());
    }
}
