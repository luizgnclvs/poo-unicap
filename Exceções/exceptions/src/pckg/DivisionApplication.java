package pckg;

import java.util.Scanner;

public class DivisionApplication {

    public static void main(String[] args) throws DivisionByZeroException {
        try (Scanner read = new Scanner(System.in)) {
            System.out.println("\nOlá!\nBem-vindo à aplicação de divisão.");

            while (true) {
                System.out.printf(
                    "%n%s%n%d\t%s%n%d\t%s%n",
                    "O que deseja fazer?",
                    1, "Divisão",
                    0, "Sair"
                );

                System.out.println();

                int option = read.nextInt();

                System.out.println();

                while (option != 1 && option != 0) {
                    System.out.print("Opção inválida! Tente novamente: ");
                    option = read.nextInt();

                    if (option == 0 || option == 1) {
                        System.out.println();
                    }
                }

                if (option == 0) {
                    System.out.println("Obrigado pelo seu tempo.");
                    break;
                } else {
                    System.out.print(
                        "Ótima escolha!\n" +
                        "Agora está na hora de escolher os números aos quais deseja-se realizar a operação.\n\n"
                    );

                    System.out.print("Dividendo: ");
                    double dividend = read.nextDouble();

                    System.out.print("Divisor: ");
                    double divisor = read.nextDouble();

                    try {
                        System.out.println();
                        Division.calculate(dividend, divisor);
                    } catch (DivisionByZeroException exception) {
                        System.out.println(exception.getMessage());
                    }
                }
            }
        }
    }
}
