package pckg2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import pckg2.components.Services;
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
                if (account != null) {
                    if (newAccount.getNumber() == account.getNumber()) {
                        throw new PreexistingElementException("Uma conta com este mesmo número já encontra-se no repositório.");
                    }
                }
            }

            repository[slot] = newAccount;
            slot++;
        }
    }

    public static void remove (int accountNumber) {
        for (int i = 0; i < repository.length; i++) {
            if (repository[i] != null && accountNumber == repository[i].getNumber()) {
                repository[i] = null;
                slot--;
            }
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

    public static void printAccountSimple (Account account) {
        System.out.printf(
            "%s: %d\t%s: R$ %.2f%n%s: %s",
            "Nº", account.getNumber(),
            "Saldo", account.getBalance(),
            "Proprietário", account.getClient().getName()
        );
    }

    public static void printAccount (Account account) {
        //Salário foi propositalmente omitido e não esquecido.
        System.out.printf(
            "%s: %d\t%s: R$ %.2f\t%s: R$ %.2f%n%s: %s\t%s%n%s: %s\t%s: %s%n%s:%n%s",
            "Nº", account.getNumber(), "Saldo", account.getBalance(), "Limite", account.getLimit(),
            "Proprietário", account.getClient().getName().toString(), account.getClient().getInfo().toString(),
            "Data de Nascimento", account.getClient().getDateOfBirth().toString(), "Telefone", account.getClient().getPhone().toString(),
            "Endereço", account.getClient().getAddress().toString()
        );
    }

    public static void main(String[] args) throws RepositoryException, InvalidDataException {
         System.out.println("\nOlá!\nSeja bem-vindo.");

        while (true) {
            System.out.printf(
                "%n%s%n%n\t%d - %s%n\t%d - %s%n\t%d - %s%n%n",
                "Qual operação você deseja realizar no repositório?",
                1, "Inserir conta", 2, "Buscar conta", 3, "Sair"
            );

            System.out.print("Opção: ");
            int option = Services.validOption(1, 3);

            if (option == 3) {
                System.out.println("Obrigado pela atenção.\nAdeus.");
                break;
            } else if (option == 1) {
                System.out.print("Certo!\nVamos iniciar o processo de cadastro.\n\nComeçaremos pelo número da conta: ");

                int accountNumber = read.nextInt();

                try {
                    Account account = new Account(accountNumber);
                    insert(account);

                    Client newClient = ClientRegistration.registerNewClient();

                    account.setClient(newClient);

                    System.out.print("\nInsira o valor do saldo atual da conta: R$ ");
                    account.setBalance(read.nextDouble());

                    System.out.print("\nO limite da conta é definido automaticamente através do salário do cliente.");
                    account.setLimit(newClient.getSalary());
                    System.out.printf("\nLimite da conta: R$ %.2f", account.getLimit());
                    System.out.println();
                } catch (Exception exception) {
                    System.out.println("\n" + exception.getMessage());
                    remove(accountNumber);
                }
            } else {
                System.out.print("Certo.\nInsira o número da conta que deseja buscar: ");

                int searchedAccountNumber = read.nextInt();

                System.out.println();

                while (!Services.isNumberLengthValid(searchedAccountNumber, 8)) {
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

                    option = Services.validOption(1, 2);

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
