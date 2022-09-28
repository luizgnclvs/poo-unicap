package question5;

import java.util.Scanner;

import question1.AdministrativeAssistant;
import question1.Assistant;
import question1.TechnicalAssistant;
import question2.a.Animal;
import question2.a.Cat;
import question2.a.Dog;
import question2.b.Miserable;
import question2.b.Person;
import question2.b.Poor;
import question2.b.Rich;
import question3.LowerVIPArea;
import question3.Regular;
import question3.Ticket;
import question3.UpperVIPArea;
import question4.New;
import question4.Old;
import question4.RealEstate;

// import question4.New;
// import question4.Old;

public class Test {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            System.out.println("\nLetra A)\n");

            Assistant administrative = new AdministrativeAssistant("Luiz", 1500, 1, "Noturno");
            Assistant technical = new TechnicalAssistant("Felipe", 2200, 2);

            System.out.printf("Matrícula %d - Funcionário: %s\n", administrative.getRegistry(), administrative.getName());
            System.out.printf("Matrícula %d - Funcionário: %s\n", technical.getRegistry(), technical.getName());


            System.out.println("\n\nLetra B)\n");

            Animal dog = new Dog("Milo");
            Animal cat = new Cat("Chili");

            ((Dog)dog).bark();
            ((Cat)cat).meow();

            System.out.println();

            dog.walk();
            cat.walk();


            System.out.println("\n\nLetra C)\n");

            Person rich = new Rich("Liz", 21, 1000000);
            Person poor = new Poor("Maria", 33);
            Person miserable = new Miserable("Eduardo", 27);

            ((Rich)rich).shop();
            ((Poor)poor).work();
            ((Miserable)miserable).beg();


            System.out.println("\n\nLetra D)\n");

            Ticket ticket;

            System.out.println("Olá! Qual tipo de ingresso você deseja?\nDigite \'1\' para um ingresso normal ou \'2\' para um ingresso VIP.\n");

            int ticketOption = read.nextInt();

            System.out.println();

            while (ticketOption < 1 || ticketOption > 2) {
                System.out.print("Opção inválida! Tente novamente: ");
                ticketOption = read.nextInt();
            }

            if (ticketOption == 2) {
                System.out.println("\nVocê deseja um ingresso para o Camarote Superior ou para o Camarote Inferior?\nDigite \'1\' ou \'2\' para a respectiva opção.\n");

                int vipOption = read.nextInt();

                System.out.println();

                while (vipOption < 1 || vipOption > 2) {
                    System.out.print("Opção inválida! Tente novamente: ");
                    vipOption = read.nextInt();
                }

                System.out.println();

                if (vipOption == 1) {
                    ticket = new UpperVIPArea(300, 40, "Camarote Superior", 75);

                    ((UpperVIPArea)ticket).printArea();
                    ticket.printValue();
                } else {
                    ticket = new LowerVIPArea(300, 40, "Camarote Inferior");

                    ((LowerVIPArea)ticket).printArea();
                    ticket.printValue();
                }
            } else {
                ticket = new Regular(300);

                System.out.println();

                ((Regular)ticket).printTicket();
                ticket.printValue();
            }


            System.out.println("\n\n\nLetra E)\n");

            RealEstate realEstate;

            System.out.println("Olá! Selecione o tipo de imóvel que deseja.\nDigite \'1\' se deseja um imóvel velho ou \'2\' se prefere um novo.\n");

            int realEstateOption = read.nextInt();

            System.out.println();

            while (realEstateOption < 1 || realEstateOption > 2) {
                System.out.print("Opção inválida! Tente novamente: ");
                realEstateOption = read.nextInt();
            }

            System.out.println();

            if (realEstateOption == 1) {
                realEstate = new Old("Rua Cinco, 123", 150000, 20000);
                ((Old)realEstate).printPrice();
            } else {
                realEstate = new New("Avenida Três, 27", 300000, 35000);
                ((New)realEstate).printPrice();
            }
        }
    }
}
