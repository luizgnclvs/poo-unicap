package pckg;

import java.util.Scanner;

public class SquareApplication {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            System.out.print("\nOlá! Informe o lado desejado para seu quadrado: ");
            double side = read.nextDouble();

            Square square = new Square(side);

            System.out.printf(
                "%nInformações do Quadrado%nLado: %f%nPerímetro: %f%nÁrea: %f%n",
                square.side, square.perimeter(), square.area()
            );
            square.draw();
        }
    }
}
