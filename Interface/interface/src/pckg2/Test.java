package pckg2;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            System.out.println("\nOlá! Seja bem-vindo.");

            while (true) {
                System.out.printf(
                    "%n%s %n%s %n%n\t%d - %s %n\t%d - %s %n\t%d - %s %n\t%d - %s %n\t%d - %s%n%n",
                    "Aqui você pode executar diversas operações matemáticas,", "basta selecionar a opção adequada.",
                    1, "Adição", 2, "Subtração", 3, "Multiplicação", 4, "Divisão", 0, "Sair"
                );

                int option = read.nextInt();

                System.out.println();

                while (option < 0 || option > 4) {
                    System.out.print("Opção inválida! Tente novamente: ");
                    option = read.nextInt();
                }

                if (option == 0) {
                    System.out.println("Obrigado pela atenção.");
                    break;
                } else {
                    System.out.printf(
                        "%n%s%n%s%n%n%s",
                        "Ótima escolha!", "Agora vamos inserir os números ~ inteiros ~ aos quais deseja-se calcular.",
                        "Começando pelo primeiro: "
                    );
   
                    int a = read.nextInt();
   
                    System.out.print("E agora o segundo: ");
                    int b = read.nextInt();

                    MathematicalOperation operation;

                    if (option == 1) {
                        operation = new Addition();
                    } else if (option == 2) {
                        operation = new Subtraction();
                    } else if (option ==3) {
                        operation = new Multiplication();
                    } else {
                        operation = new Division();
                    }

                    System.out.println("\nResultado: " + operation.calculate(a, b));
                }
            }
        }
    }
}
