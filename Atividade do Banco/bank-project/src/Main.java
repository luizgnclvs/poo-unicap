import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner read = new Scanner(System.in);

    private static ArrayList<Account> repository;

    public static int menu () {
        System.out.printf(
            "%n%s%n%n\t%d - %s%n\t%d - %s%n\t%d - %s%n\t%d - %s%n%n",
            "Qual operação você deseja realizar no repositório?",
            1, "Abrir conta", 2, "Buscar conta", 3, "Exibir todas as contas", 4, "Sair"
        );

        System.out.print("Opção: ");
        int option = Services.validOption(1, 4);

        return option;
    }

    public static void printAllAccounts () {
        int index = 1;

        System.out.println("   CONTAS CADASTRADAS");

        for (Account account : repository) {
            if (account != null) {
                System.out.println("Conta Nº " + index + ": \t" + account.getNumber());
                index++;
            }
        }
    }

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

    }

    public static void main(String[] args) {
        System.out.println("\nOlá!\nSeja bem-vindo.");

        while (true) {
            int option = menu();

            if (option == 1) {

            } else if (option == 2) {

            } else if (option == 3) {
                printAllAccounts();
            } else {
                System.out.println("Ok. Obrigado pela atenção.\nTenha um bom dia :)");
                break;
            }
        }
    }
}
