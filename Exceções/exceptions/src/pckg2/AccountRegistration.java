package pckg2;

import java.util.Scanner;

import pckg2.components.Services;
import pckg2.exceptions.InvalidDataException;
import pckg2.exceptions.NonexistentElementException;
import pckg2.exceptions.PreexistingElementException;
import pckg2.exceptions.RepositoryException;



public class AccountRegistration {
    private static Scanner read = new Scanner(System.in);

    private static Account [] repository = new Account [10];
    private static int slot = 0;

    public static Account insert () throws RepositoryException, PreexistingElementException, InvalidDataException {
        if (slot >= repository.length) {
            throw new RepositoryException();
        } else {
            System.out.print("Certo!\nVamos iniciar o processo de cadastro.\n\nComeçaremos pelo número da conta: ");
            Account newAccount = new Account(read.nextInt());

            for (Account account : repository) {
                if (account != null) {
                    if (newAccount.getNumber() == account.getNumber()) {
                        throw new PreexistingElementException("Uma conta com este mesmo número já encontra-se no repositório.");
                    }
                }
            }

            return newAccount;
        }
    }

    public static void remove (int accountNumber) {
        //Idealmente haveria uma chamada ao método search() para confirmar que a conta a ser deletada encontra-se no repositório.
        //Entretanto, como dentro da main o método remove() só pode ser chamado após a execução bem-sucedida do método search(), essa implementação torna-se redundante.
        Account [] cloneRepository = new Account [repository.length];

        for (int i = 0; i < repository.length; i++) {
            if (repository[i] != null) {
                if (repository[i].getNumber() == accountNumber) {
                    for (int j = i; j < repository.length - 1; j++) {
                        if (repository[j] != null) {
                            cloneRepository[j] = repository[j + 1];
                        }
                    }

                    break;
                } else {
                    cloneRepository[i] = repository[i];
                }
            }
        }

        repository = cloneRepository;
        slot--;
    }

    public static Account search (int accountNumber) throws NonexistentElementException {
        for (Account account : repository) {
            if (account != null) {
                if (account.getNumber() == accountNumber) {
                    return account;
                }
            }
        }

        throw new NonexistentElementException();
    }

    public static void simplePrint (Account account) {
        System.out.printf(
            "%s: %d\t%s: R$ %.2f%n%s: %s",
            "Nº", account.getNumber(),
            "Saldo", account.getBalance(),
            "Proprietário", account.getClient().getName()
        );
    }

    public static void fullPrint (Account account) {
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
                "%n%s%n%n\t%d - %s%n\t%d - %s%n\t%d - %s%n\t%d - %s%n%n",
                "Qual operação você deseja realizar no repositório?",
                1, "Inserir conta", 2, "Buscar conta", 3, "Exibir todas as contas", 4, "Sair"
            );

            System.out.print("Opção: ");
            int option = Services.validOption(1, 4);

            if (option == 4) {
                System.out.println("Obrigado pela atenção.\nAdeus.");
                break;
            } else if (option == 1) {
                try {
                    Account account = insert();

                    Client newClient = ClientRegistration.registerNewClient();

                    account.setClient(newClient);

                    System.out.print("\nInsira o valor do saldo atual da conta: R$ ");
                    account.setBalance(read.nextDouble());

                    System.out.print("\nO limite da conta é definido automaticamente através do salário do cliente.");
                    account.setLimit(newClient.getSalary());
                    System.out.printf("\nLimite da conta: R$ %.2f", account.getLimit());
                    System.out.println();

                    repository[slot] = account;
                    slot++;

                    System.out.println("Conta cadastrada com sucesso.");
                } catch (RepositoryException exception) {
                    System.out.println(exception.getMessage());
                } catch (Exception exception) {
                    System.out.println();
                    System.out.println(exception.getMessage());
                }
            } else if (option == 2) {
                System.out.print("Certo.\nInsira o número da conta que deseja buscar: ");

                int searchedAccountNumber = read.nextInt();

                boolean first = true;

                while (!Services.isNumberLengthValid(searchedAccountNumber, 8)) {
                    if (first) {
                        System.out.println();
                        first = false;
                    }

                    System.out.print("O valor inserido não é um número de conta válido. Tente novamente: ");
                    searchedAccountNumber = read.nextInt();
                }

                try {
                    Account searchedAccount = search(searchedAccountNumber);

                    System.out.println();
                    simplePrint(searchedAccount);

                    while (true) {
                        System.out.printf(
                            "%n%s%n%n\t%d - %s%n\t%d - %s%n\t%d - %s%n%n",
                            "O que deseja fazer com a conta encontrada?",
                            1, "Expandir", 2, "Excluir", 3, "Voltar"
                        );

                        System.out.print("Opção: ");
                        option = Services.validOption(1, 3);

                        if (option == 1) {
                            fullPrint(searchedAccount);
                        } else if (option == 2) {
                            remove(searchedAccountNumber);
                            System.out.println("A conta foi removida com sucesso.");

                            break;
                        } else {
                            break;
                        }
                    }
                } catch (NonexistentElementException exception) {
                    System.out.println();
                    System.out.println(exception.getMessage());
                }
            } else {
                int index = 1;

                System.out.println("   CONTAS CADASTRADAS");

                for (Account account : repository) {
                    if (account != null) {
                        System.out.println("Conta Nº " + index + ": \t" + account.getNumber());
                        index++;
                    }
                }
            }
        }
    }
}
