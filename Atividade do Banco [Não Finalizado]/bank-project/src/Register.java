import java.util.List;
import java.util.Scanner;

import exceptions.BlankTextException;
import exceptions.InvalidDataException;

public class Register {
    private static final Scanner read = new Scanner(System.in);

    public static Account registerAccount (List<Account> repository) {
        System.out.print("Certo!\nVamos iniciar o processo de cadastro.\n\nComeçaremos pelo seu registro.");

        Client client = registerClient();

        System.out.printf(
            "%n%s%n%s%n%n%s%n\t%d\t%s%n\t%d\t%s%n%s",
            "Ótimo!", "Vamos iniciar o processo de cadastro de conta.", "Qual tipo de conta você deseja abrir?",
            1, "Conta Corrente", 2, "Conta Poupança", "Tipo da conta: "
        );

        int type = Services.validOption(1, 2);

        System.out.print("\nAgora informe o número da agência: ");
        int agency = read.nextInt();

        while (!Services.isNumberLengthValid(agency, 4)) {
            System.out.print("\nNúmero inválido. Lembre que a agência é identificada por um número de quatro dígitos.\nTente novamaente: ");
            agency = read.nextInt();
        }

        System.out.println();

        Account account;

        if (type == 1) {
            account = new CheckingAccount(client, agency);
        } else {
            account = new SavingsAccount(client, agency);
        }

        for (Account item : repository) {
            if (item != null) {
                if (account.getNumber() == item.getNumber()) {
                    
                }
            }
        }

        // return newAccount;
    }

    public static Client registerClient () throws InvalidDataException {
        Client client = new Client();

        System.out.print("\nInsira seu nome: ");
        String name = read.nextLine();

        try {
            client.setName(name);
        } catch (InvalidDataException exception) {
            System.out.println("\n" + exception.getMessage());
            
            name = Services.catchInvalidData(name);
            client.setName(name);
        }

        ClientInfo info;

        System.out.printf(
            "%n%s%n\t%d\t%s%n\t%d\t%s%n%n%s",
            "Qual seu tipo de cliente?", 1, "Físico", 2, "Jurídico", "Tipo: "
        );

        int type = Services.validOption(1, 2);

        if (type == 1) {
            info = new NaturalPersonInfo();
        } else {
            info = new LegalPersonInfo();
        }

        info = registerClientInfo(info);
        client.setPersonalInfo(info);

        Address address = registerAddress();
        client.setAddress(address);

        System.out.printf(
            "%n%s%n\t%d\t%s%n\t%d\t%s%n%s",
            "Você deseja informar alguma informação de contato?", 1, "Sim", 2, "Não", "Opção: "
        );

        int option = Services.validOption(1, 2);

        while (option == 1) {
            ContactInfo contact = registerContactInfo();
            client.addContact(contact);

            System.out.printf(
                "%n%s%n\t%d\t%s%n\t%d\t%n%s",
                "Deseja cadastrar mais algum conatato?", 1, "Sim", 2, "Não", "Opção: "
            );

            option = Services.validOption(1, 2);
        }

        System.out.println("\nSeu registro foi cadastrado com sucesso.\n");

        return client;
    }

    public static ClientInfo registerClientInfo (ClientInfo info) throws InvalidDataException{
        if (info instanceof NaturalPersonInfo) {
            System.out.print("\nCerto.\nVamos começar pelo seu CPF: ");
            long CPF = read.nextLong();

            try {
                ((NaturalPersonInfo)info).setCPF(CPF);
            } catch (InvalidDataException exception) {
                System.out.println("\n" + exception.getMessage());

                CPF = Services.catchInvalidData(CPF, 11);
                ((NaturalPersonInfo)info).setCPF(CPF);
            }

            System.out.print("Agora insira seu RG: ");
            int RG = read.nextInt();

            try {
                ((NaturalPersonInfo)info).setRG(RG);
            } catch (InvalidDataException exception) {
                System.out.println("\n" + exception.getMessage());

                RG = Services.catchInvalidData(RG, 7);
                ((NaturalPersonInfo)info).setRG(RG);
            }
        } else {
            System.out.println("\nOk. Insira seu CNPJ");
            long CNPJ = read.nextLong();

            try {
                ((LegalPersonInfo)info).setCNPJ(CNPJ);
            } catch (InvalidDataException exception) {
                System.out.println("\n" + exception.getMessage());

                CNPJ = Services.catchInvalidData(CNPJ, 14);
                ((LegalPersonInfo)info).setCNPJ(CNPJ);
            }
        }

        return info;
    }

    public static Address registerAddress () throws InvalidDataException {
        Address address = new Address();

        System.out.print("\nCerto.\nPrimeiro, precisamos cadastrar o CEP.");
        CEP CEP = registerCEP();
        address.setCEP(CEP);

        System.out.print("\nOK. Agora insira o número da sua residência: ");
        int number = read.nextInt();

        try {
            address.setNumber(number);
        } catch (InvalidDataException exception) {
            System.out.println("\n" + exception.getMessage());

            number = Services.catchInvalidData(number);
            address.setNumber(number);
        }

        System.out.printf(
            "%n%s%n\t%d\t%s%n\t%d\t%s%n%n%s",
            "Seu endereço possui algum complemento?", 1, "Sim", 2, "Não", "Opção: "
        );

        int option = Services.validOption(1, 2);

        if (option == 1) {
            System.out.print("\nOk, qual o complemento? ");
            String complement = read.nextLine();

            try {
                address.setComplement(complement);
            } catch (InvalidDataException exception) {
                System.out.println("\n" + exception.getMessage());

                complement = Services.catchInvalidData(complement);
                address.setComplement(complement);
            }
        }

        System.out.println();

        return address;
    }

    public static CEP registerCEP () throws InvalidDataException {
        CEP CEP = new CEP();

        System.out.print("\nInsira o número do seu CEP: ");
        int code = read.nextInt();

        try {
            CEP.setCode(code);
        } catch (InvalidDataException exception) {
            System.out.println("\n" + exception.getMessage());

            code = Services.catchInvalidData(code, 8);
            CEP.setCode(code);
        }

        System.out.print("\nInsira o nome do logradouro: ");
        String street = read.nextLine();

        try {
            CEP.setStreet(street);
        } catch (InvalidDataException exception) {
            System.out.println("\n" + exception.getMessage());

            street = Services.catchInvalidData(street);
            CEP.setStreet(street);
        }

        System.out.print("\nInsira seu bairro: ");
        String district = read.nextLine();

        try {
            CEP.setDistrict(district);
        } catch (InvalidDataException exception) {
            System.out.println("\n" + exception.getMessage());

            district = Services.catchInvalidData(district);
            CEP.setDistrict(district);
        }

        System.out.print("\nInsira a sua cidade: ");
        String city = read.nextLine();

        try {
            CEP.setCity(city);
        } catch (InvalidDataException exception) {
            System.out.println("\n" + exception.getMessage());

            city = Services.catchInvalidData(city);
            CEP.setCity(city);
        }

        System.out.print("\nInsira seu estado: ");
        String state = read.nextLine();

        try {
            CEP.setState(state);
        } catch (InvalidDataException exception) {
            System.out.println("\n" + exception.getMessage());

            state = Services.catchInvalidData(state);
            CEP.setState(state);
        }

        System.out.println();

        return CEP;
    }

    public static ContactInfo registerContactInfo () throws InvalidDataException {
        ContactInfo info;

        System.out.printf(
            "%n%s%n%s%n\t%d\t%s%n\t%d\t%s%n%s",
            "Ok!", "Qual tipo de contato você deseja cadastrar?", 1, "Telefone", 2, "Email", "Opção: "
        );

        int option = Services.validOption(1, 2);

        if (option == 1) {
            info = new Phone();
            info = registerPhone((Phone)info);
        } else {
            info = new Email();
            info = registerEmail((Email)info);
        }

        System.out.println();

        return info;
    }

    public static ContactInfo registerPhone (Phone info) throws InvalidDataException {
        info = new Phone();

        System.out.print("\nCerto. Primeiramente insira o DDI: +");
        int DDI = read.nextInt();

        try {
            ((Phone)info).setDDI(DDI);
        } catch (InvalidDataException exception) {
            System.out.println("\n" + exception.getMessage());

            DDI = Services.catchInvalidData(DDI, 1, 3);
            ((Phone)info).setDDI(DDI);
        }

        System.out.print("Agora insira o DDD: (");
        int DDD = read.nextInt();
        System.out.print(")");

        try {
            ((Phone)info).setDDD(DDD);
        } catch (InvalidDataException exception) {
            System.out.println("\n" + exception.getMessage());

            DDD = Services.catchInvalidData(DDD, 2);
            ((Phone)info).setDDD(DDD);
        }

        System.out.print("E por fim insira seu número: ");
        int number = read.nextInt();

        try {
            ((Phone)info).setNumber(number);
        } catch (InvalidDataException exception) {
            System.out.println("\n" + exception.getMessage());

            number = Services.catchInvalidData(number, 8, 9);
            ((Phone)info).setNumber(number);
        }

        System.out.println();

        return info;
    }

    public static ContactInfo registerEmail (Email info) throws InvalidDataException {
        info = new Email();

        System.out.print("\nCerto. Insira o provedor do email: ");
        String provider = read.next();

        try {
            ((Email)info).setProvider(provider);
        } catch (InvalidDataException exception) {
            System.out.println("\n" + exception.getMessage());

            provider = Services.catchInvalidData(provider , "[a-zA-Z0-9]*");
            ((Email)info).setProvider(provider);
        }

        System.out.print("\nE agora insira seu usuário: ");
        String user = read.next();

        try {
            ((Email)info).setUser(user);
        } catch (InvalidDataException exception) {
            System.out.println("\n" + exception.getMessage());

            user = Services.catchInvalidData(user, "[a-zA-Z0-9]*");
            ((Email)info).setUser(user);
        }

        System.out.println();

        return info;
    }
}
