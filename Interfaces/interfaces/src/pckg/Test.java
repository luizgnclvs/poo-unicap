package pckg;

public class Test {

    public static void main(String[] args) {
        GeometricShape circle = new Circle(5.5);
        GeometricShape square = new Square(7.8);

        System.out.printf(
            "%nCÍRCULO%nÁrea: %f%nPerímetro: %f%n%nQUADRADO%nÁrea: %f%nPerímetro: %f",
            circle.area(), circle.perimeter(), square.area(), square.perimeter()
        );
    }
}
