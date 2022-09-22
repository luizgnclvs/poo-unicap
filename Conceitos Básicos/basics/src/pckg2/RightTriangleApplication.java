package pckg2;

import java.util.Scanner;

public class RightTriangleApplication {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            System.out.print("\nOlá!\nInforme a base do triângulo: ");
            double base = read.nextDouble();

            System.out.print("Agora informe a altura: ");
            double height = read.nextDouble();

            RightTriangle triangle = new RightTriangle(base, height);

            System.out.printf(
                "%nInformações do Triângulo%nBase: %f%nAltura: %f%nHipotenusa: %f%nPerímetro: %f%nÁrea: %f",
                triangle.base, triangle.height, triangle.hypotenuse, triangle.perimeter(), triangle.area()
            );
        }
    }
}
