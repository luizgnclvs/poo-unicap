import java.util.Scanner;

import exceptions.InvalidDataException;

public class Register {
    private static final Scanner read = new Scanner(System.in);

    public static Account registerAccount () {
        System.out.print("Certo!\nVamos iniciar o processo de cadastro.\n\nComeçaremos pelo seu registro.");

        Client client = registerClient();

        // System.out.printf(
        //     "%s%n%s%n%n%s%n\t%d\t%s%n\t%d\t%s",
        //     "Certo!", "Vamos iniciar o processo de cadastro.", "Qual tipo de conta você deseja abrir?",
        //     1, "Conta Corrente", 2, "Conta Poupança"
        // );

        int type = Services.validOption(1, 2);

        // Account newAccount;

        // if (type == 1) {
        //     newAccount = new CheckingAccount(null, type)
        // }

        // for (Account account : repository) {
        //     if (account != null) {
        //         if (newAccount.getNumber() == account.getNumber()) {
        //             throw new PreexistingElementException("Uma conta com este mesmo número já encontra-se no repositório.");
        //         }
        //     }
        // }

        // return newAccount;
    }

    public static Client registerClient () {
        Client client = new Client();

        System.out.print("\nInsira seu nome: ");
        String name = read.nextLine();
        client.setName(name);

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
            info = registerPhone(info)
        } else {
            info = registerEmail(info);
        }

        return info;
    }

    public static ContactInfo registerPhone (ContactInfo info) throws InvalidDataException {
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

        return info;
    }

    public static ContactInfo registerEmail (ContactInfo info) throws InvalidDataException {
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

        return info;
    }
}
