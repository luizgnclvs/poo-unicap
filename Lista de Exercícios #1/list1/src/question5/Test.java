package question5;

import java.util.Scanner;

import question1.AdministrativeAssistant;
import question1.TechnicalAssistant;
import question2.a.Cat;
import question2.a.Dog;
import question2.b.Miserable;
import question2.b.Poor;
import question2.b.Rich;
import question3.LowerVIPArea;
import question3.Regular;
import question3.UpperVIPArea;
import question4.New;
import question4.Old;

public class Test {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            System.out.println("\nLetra A)\n");
            AdministrativeAssistant assistant1 = new AdministrativeAssistant("Luiz", 1500, 1, "Noturno");
            TechnicalAssistant assistant2 = new TechnicalAssistant("Felipe", 2200, 2);

            System.out.printf("Matrícula %d - Funcionário: %s\n", assistant1.getRegistry(), assistant1.getName());
            System.out.printf("Matrícula %d - Funcionário: %s\n", assistant2.getRegistry(), assistant2.getName());


            System.out.println("\n\nLetra B)\n");
            Dog dog = new Dog("Milo");
            Cat cat = new Cat("Chili");

            dog.bark();
            cat.meow();

            dog.walk();
            cat.walk();


            System.out.println("\n\nLetra C)\n");
            Rich rich = new Rich("Liz", 21, 1000000);
            Poor poor = new Poor("Maria", 33);
            Miserable miserable = new Miserable("Eduardo", 27);

            rich.shop();
            poor.work();
            miserable.beg();


            System.out.println("\n\nLetra D)\n");
            System.out.println("Olá! Qual tipo de ingresso você deseja?\nDigite \'1\' para um ingresso normal ou \'2\' para um ingresso VIP.\n");

            int ticketOption = read.nextInt();

            while (ticketOption < 1 || ticketOption > 2) {
                System.out.print("\nOpção inválida! Tente novamente: ");
                ticketOption = read.nextInt();
            }

            if (ticketOption == 2) {
                System.out.println("\nVocê deseja um ingresso para o Camarote Superior ou para o Camarote Inferior?\nDigite \'1\' ou \'2\' para a respectiva opção.\n");

                int vipOption = read.nextInt();

                while (vipOption < 1 || vipOption > 2) {
                    System.out.print("\nOpção inválida! Tente novamente: ");
                    vipOption = read.nextInt();
                }

                System.out.println();

                if (vipOption == 1) {
                    UpperVIPArea ticket = new UpperVIPArea(300, 40, "Camarote Superior", 75);

                    ticket.printArea();
                    ticket.printValue();
                } else {
                    LowerVIPArea ticket = new LowerVIPArea(300, 40, "Camarote Inferior");

                    ticket.printArea();
                    ticket.printValue();
                }
            } else {
                Regular ticket = new Regular(300);

                System.out.println();

                ticket.printTicket();
                ticket.printValue();
            }


            System.out.println("\n\n\nLetra E)\n");
            System.out.println("Olá! Selecione o tipo de imóvel que deseja.\nDigite \'1\' se deseja um imóvel velho ou \'2\' se prefere um novo.\n");

            int realEstateOption = read.nextInt();

            while (realEstateOption < 1 || realEstateOption > 2) {
                System.out.print("\nOpção inválida! Tente novamente: ");
                realEstateOption = read.nextInt();
            }

            System.out.println();

            if (realEstateOption == 1) {
                Old realEstate = new Old("Rua Cinco, 123", 150000, 20000);
                realEstate.printPrice();
            } else {
                New realEstate = new New("Avenida Três, 27", 300000, 35000);
                realEstate.printPrice();
            }
        }
    }
}
