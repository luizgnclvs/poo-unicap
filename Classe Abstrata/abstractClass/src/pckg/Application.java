package pckg;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            Employee manager = new Manager ("Luiz", 2000);
            Employee programmer = new Programmer("Felipe", 1800);

            System.out.println("\nOlá! Seja bem-vindo.");

                while (true) {
                    int operation;
                    int employee;

                    System.out.printf(
                        "%n%s %n%n\t%d - %s %n\t%d - %s %n\t%d - %s%n%n",
                        "Qual operação você deseja realizar?",
                        1, "Imprimir dados", 2, "Aumentar salário", 0, "Sair"
                    );

                    operation = read.nextInt();

                    System.out.println();

                    while (operation < 0 || operation > 2) {
                        System.out.print("Opção inválida! Tente novamente: ");
                        operation = read.nextInt();
                    }

                    if (operation == 0) {
                        System.out.println("\nObrigado pela atenção.");
                        break;
                    } else {
                        System.out.printf(
                            "%n%s %n%n\t%d - %s %n\t%d - %s%n%n",
                            "Agora escolha o funcionário ao qual será aplicada a operação.",
                            1, "Gerente", 2, "Programador"
                        );

                        employee = read.nextInt();

                        System.out.println();

                        while (employee != 1 && employee != 2) {
                            System.out.print("Opção inválida! Tente novamente: ");
                            employee = read.nextInt();
                        }

                        System.out.println();

                        if (operation == 1) {
                            System.out.println("Funcionário\n");

                            if (employee == 1) {
                                System.out.println(manager.toString());
                            } else {
                                System.out.println(programmer.toString());
                            }
                        } else {
                            if (employee == 1) {
                                manager.raiseSalary();
                            } else {
                                programmer.raiseSalary();
                            }

                            System.out.println("Aumento realizado com sucesso.\n");
                        }
                    }
                }
        }
    }
}
