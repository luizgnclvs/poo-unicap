package pckg2;

import java.util.Scanner;

import pckg2.components.Address;
import pckg2.components.CEP;
import pckg2.components.ClientInfo;
import pckg2.components.Date;
import pckg2.components.LegalPersonInfo;
import pckg2.components.LegalPersonName;
import pckg2.components.Name;
import pckg2.components.NaturalPersonInfo;
import pckg2.components.NaturalPersonName;
import pckg2.components.Phone;
import pckg2.components.Services;
import pckg2.components.State;
import pckg2.exceptions.InvalidDataException;

public class ClientRegistration {
    private static Scanner read = new Scanner(System.in);

    public static Client registerNewClient () throws InvalidDataException {
        Client client = new Client();

        System.out.println("\nÓtimo!\nAgora preencheremos os dados do cliente proprietário da conta.\nO cliente é do tipo (1) Pessoa Física ou (2) Pessoa Jurídica?\n(Insira o número correspondente à opção desejada)\n");

        System.out.print("Tipo de cliente: ");
        int clientType = Services.validOption(1, 2);

        Name name;
        ClientInfo info;

        System.out.println("Certo.\nComeçaremos preenchendo o nome.\n");

        if (clientType == 1) {
            name = new NaturalPersonName();
            info = new NaturalPersonInfo();
        } else {
            name = new LegalPersonName();
            info = new LegalPersonInfo();
        }

        name = registerNewName(name);

        System.out.println("\nE agora seguimos com os dados sensíveis.\n");

        info = registerNewInfo(info);

        client.setName(name);
        client.setInfo(info);

        System.out.println("\nAdiante, vamos inserir algumas informações adicionais.\n");

        Date date = registerNewDate();
        System.out.println();
        Phone phone = registerNewPhone();
        System.out.println();
        Address address = registerNewAddress();

        client.setDateOfBirth(date);
        client.setPhone(phone);
        client.setAddress(address);

        System.out.print("\nE, por fim, mas não menos importante, insira o salário (ou receita mensal) do cliente: R$ ");
        client.setSalary(read.nextDouble());

        return client;
    }

    public static Name registerNewName (Name name) throws InvalidDataException {
        if (name instanceof NaturalPersonName) {
            System.out.print("Primeiro nome: ");
            ((NaturalPersonName)name).setFirstName(read.next());
            System.out.print("Nome do meio: ");
            ((NaturalPersonName)name).setMiddleName(read.next());
            read.nextLine(); //Consumo de linha.
            System.out.print("Sobrenome: ");
            ((NaturalPersonName)name).setSurname(read.nextLine());
        } else {
            read.nextLine();
            System.out.print("Razão Social: ");
            ((LegalPersonName)name).setCompanyName(read.nextLine());
            System.out.print("Nome Fantasia: ");
            ((LegalPersonName)name).setTradeName(read.nextLine());
        }

        return name;
    }

    public static ClientInfo registerNewInfo (ClientInfo info) throws InvalidDataException {
        if (info instanceof NaturalPersonInfo) {
            System.out.print("CPF: ");
            ((NaturalPersonInfo)info).setCPF(read.nextLong());
            System.out.print("RG: ");
            ((NaturalPersonInfo)info).setRG(read.nextInt());
        } else {
            System.out.print("CNPJ: ");
            ((LegalPersonInfo)info).setCNPJ(read.nextLong());
        }
        read.nextLine();

        return info;
    }

    public static Date registerNewDate () throws InvalidDataException {
        Date date = new Date();

        System.out.println("DATA DE NASCIMENTO (ou de fundação)");
        System.out.print("Ano: ");
        date.setYear(read.nextInt());
        System.out.print("Mês: ");
        date.setMonth(read.nextInt());
        System.out.print("Dia: ");
        date.setYear(read.nextInt());
        read.nextLine();

        return date;
    }

    public static Phone registerNewPhone () throws InvalidDataException {
        Phone phone = new Phone();

        System.out.println("TELEFONE");
        System.out.print("DDD: ");
        phone.setDDD(read.nextInt());
        System.out.print("Número: ");
        phone.setNumber(read.nextInt());
        read.nextLine();

        return phone;
    }

    public static Address registerNewAddress () throws InvalidDataException {
        Address address = new Address();

        System.out.println("ENDEREÇO");
        address.setCEP(registerNewCEP());
        System.out.printf("Número: ");
        address.setNumber(read.nextInt());
        read.nextLine();
        System.out.printf("\nSeu endereço possui complemento?\n(1) Sim (2) Não\n");

        System.out.print("\nOpção: ");
        int option = Services.validOption(1, 2);

        if (option == 1) {
            read.nextLine();
            System.out.print("Complemento: ");
            address.setComplement(read.nextLine());
        } else {
            System.out.println("Ok.");
        }

        return address;
    }

    public static CEP registerNewCEP () throws InvalidDataException {
        CEP CEP = new CEP();

        System.out.print("CEP: ");
        CEP.setCode(read.nextInt());
        read.nextLine();
        System.out.print("Logradouro: ");
        CEP.setStreet(read.nextLine());
        System.out.print("Bairro: ");
        CEP.setDistrict(read.nextLine());
        System.out.print("Cidade: ");
        CEP.setCity(read.nextLine());
        System.out.print("Estado:\n");
        CEP.setState(selectState());

        return CEP;
    }

    public static State selectState () {
        int index = 1;

        System.out.println();

        for (State state : State.values()) {
            System.out.println("\t" + index + "\t" + state.getFullName());
            index++;
        }

        System.out.print("\nInsira o número correspondente ao estado qual deseja inserir: ");
        int option = Services.validOption(1, 27);

        return State.values()[option - 1];
    }
}
