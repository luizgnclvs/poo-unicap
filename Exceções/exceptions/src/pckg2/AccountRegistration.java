package pckg2;

import java.util.NoSuchElementException;
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
import pckg2.components.State;
import pckg2.exceptions.InvalidDataException;
import pckg2.exceptions.NonexistentElementException;
import pckg2.exceptions.PreexistingElementException;
import pckg2.exceptions.RepositoryException;

public class AccountRegistration {
    private static Scanner read = new Scanner(System.in);

    private static Account [] repository = new Account [2];
    private static int slot = 0;

    public static void insert (Account newAccount) throws RepositoryException, PreexistingElementException {
        if (slot >= repository.length) {
            throw new RepositoryException("O repositório está lotado e por isso não foi possível cadastrar a nova conta.");
        } else {
            for (Account account : repository) {
                if (newAccount.getNumber() == account.getNumber()) {
                    throw new PreexistingElementException("Uma conta com este mesmo número já encontra-se no repositório.");
                }
            }

            repository[slot] = newAccount;
            slot++;
        }
    }

    public static Account search (int accountNumber) throws NonexistentElementException {
        for (Account account : repository) {
            if (account.getNumber() == accountNumber) {
                return account;
            }
        }

        throw new NonexistentElementException("Não foi encontrado nenhuma conta com essa identificação.");
    }

    public static Client clientRegistration () throws InvalidDataException {
        Client client = new Client();

        System.out.println("Ok!\nVamos às informações do cliente proprietário da conta.\nO cliente é do tipo (1) Pessoa Física ou (2) Pessoa Jurídica? (Insira o número correspondente à opção desejada) ");

        int clientType = validOption(1, 2);

        Name name;
        ClientInfo info;

        System.out.println("Ótimo! \nComeçaremos pelo nome do cliente.");

        if (clientType == 1) {
            name = new NaturalPersonName();

            System.out.print("Primeiro nome: ");
            ((NaturalPersonName)name).setFirstName(read.next());
            System.out.print("Nome do meio: ");
            ((NaturalPersonName)name).setMiddleName(read.next());
            System.out.print("Sobrenome: ");
            ((NaturalPersonName)name).setSurname(read.nextLine());
        } else {
            name = new LegalPersonName();

            System.out.print("Razão Social: ");
            ((LegalPersonName)name).setCompanyName(read.nextLine());
            System.out.print("Nome Fantasia: ");
            ((LegalPersonName)name).setTradeName(read.nextLine());
        }

        System.out.println("\nPassemos às informações pessoais do cliente.");

        if (clientType == 1) {
            info = new NaturalPersonInfo();

            System.out.print("CPF: ");
            ((NaturalPersonInfo)info).setCPF(read.nextLong());
            System.out.print("RG: ");
            ((NaturalPersonInfo)info).setRG(read.nextInt());
        } else {
            info = new LegalPersonInfo();

            System.out.print("CNPJ: ");
            ((LegalPersonInfo)info).setCNPJ(read.nextLong());
        }

        client.setName(name);
        client.setInfo(info);

        System.out.println();

        Date date = new Date();

        System.out.print("Insira a data de nascimento (ou fundação) do cliente.\nAno: ");
        date.setYear(read.nextInt());
        System.out.print("Mês: ");
        date.setMonth(read.nextInt());
        System.out.print("Dia: ");
        date.setYear(read.nextInt());

        Phone phone = new Phone();

        System.out.print("Telefone\nDDD: ");
        phone.setDDD(read.nextInt());
        System.out.print("Número: ");
        phone.setNumber(read.nextInt());

        Address address = new Address();
        CEP CEP = new CEP();

        System.out.print("Endereço\nCEP: ");
        System.out.print("Logradouro: ");
        CEP.setStreet(read.nextLine());
        System.out.print("Bairro: ");
        CEP.setDistrict(read.nextLine());
        System.out.print("Cidade: ");
        CEP.setCity(read.nextLine());
        System.out.print("Estado: ");

        try {
            State state = State.valueOf(read.next().toUpperCase());
            CEP.setState(state);
        } catch (NoSuchElementException exception) {
            System.out.println(exception.getMessage());
        } finally {
            address.setCEP(CEP);
        }

        System.out.print("Número: ");
        address.setNumber(read.nextInt());
        System.out.print("Complemento: ");
        address.setComplement(read.nextLine());

        System.out.print("\nE por fim, mas não menos importante, preencha o salário do cliente: R$ ");
        client.setSalary(read.nextDouble());

        return client;
    }

    public static void printAccountSimple (Account account) {
        System.out.printf(
            "%s: %d\t%s: R$ %.2f%n%s: %s",
            "Nº", account.getNumber(),
            "Saldo", account.getBalance(),
            "Proprietário", account.getClient().getName()
        );
    }

    public static void printAccount (Account account) {
        System.out.printf(
            "%s: %d\t%s: R$ %.2f\t%s: R$ %.2f%n%s: %s\t%s%n%s: %s\t%s: %s%n%s:%n%s",
            "Nº", account.getNumber(), "Saldo", account.getBalance(), "Limite", account.getLimit(),
            "Proprietário", account.getClient().getName().toString(), account.getClient().getInfo().toString(),
            "Data de Nascimento", account.getClient().getDateOfBirth().toString(), "Telefone", account.getClient().getPhone().toString(),
            "Endereço", account.getClient().getAddress().toString()
        );
    }

    public static int validOption (int minOption, int maxOption) {
        boolean first = true;
        boolean last = false;
        int option = read.nextInt();

        while (option < minOption || option > maxOption) {
            last = false;

            if (first) {
                System.out.println();
                first = false;
            }

            System.out.print("Opção inválida! Tente novamente: ");
            option = read.nextInt();

            last = true;
        }

        if (last) {
            System.out.println();
        }

        return option;
    }

    public static void main(String[] args) {
         System.out.println("\nOlá!\nSeja bem-vindo.");

        while (true) {
            System.out.printf(
                "%n%s%n%n\t%d - %s%n\t%d - %s%n\t%d - %s%n%n",
                "Qual operação você deseja realizar?",
                1, "Inserir conta", 2, "Buscar conta", 3, "Sair"
            );

            int option = validOption(1, 3);

            if (option == 3) {
                System.out.println("Obrigado pela atenção.");
                break;
            } else if (option == 1) {
                System.out.print("Ok,\nVamos começar o processo de cadastro de uma nova conta.\n\nPrimeiro, insira os 8 dígitos que compõem o número da conta: ");

                int accountNumber = read.nextInt();

                try {
                    Account newAccount = new Account(accountNumber);

                    Client newClient = clientRegistration();

                    newAccount.setClient(newClient);

                    System.out.print("Insira o valor do saldo atual da conta: R$ ");
                    newAccount.setBalance(read.nextDouble());

                    System.out.print("O limite da conta é definido automaticamente através do salário do cliente.");
                    newAccount.setLimit(newClient.getSalary());
                    System.out.printf("Limite da conta: R$ %.2f", newAccount.getLimit());





                } catch (InvalidDataException exception) {
                    System.out.println(exception.getMessage());
                }
            } else {
                System.out.print("Ok.\n\nInsira o número da conta que deseja buscar: ");

                int searchedAccountNumber = read.nextInt();

                System.out.println();

                while (!Account.isAccountNumberValid(searchedAccountNumber)) {
                    System.out.print("O valor inserido não é um número de conta válido. Tente novamente: ");
                    searchedAccountNumber = read.nextInt();
                }

                try {
                    Account searchedAccount = search(searchedAccountNumber);

                    System.out.println();
                    printAccountSimple(searchedAccount);
                    System.out.println();

                    System.out.printf(
                        "%n%s%n%n\t%d - %s%n\t%d - %s%n",
                        "O que deseja fazer com a conta encontrada?",
                        1, "Expandir", 2, "Voltar"
                    );

                    option = validOption(1, 2);

                    if (option == 1) {
                        System.out.println();
                        printAccount(searchedAccount);
                        System.out.println();
                    } else {
                        System.out.println();
                    }

                } catch (NonexistentElementException exception) {
                    System.out.println(exception.getMessage());
                }
            }
        }
    }
}
