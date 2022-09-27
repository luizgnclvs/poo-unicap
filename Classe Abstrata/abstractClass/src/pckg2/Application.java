package pckg2;

public class Application {

    public static void main(String[] args) {
        GeometricShape square = new Square(4.5);
        GeometricShape circle = new Circle(3.9);

        System.out.printf(
            "%nQUADRADO%nÁrea: %f%nPerímetro: %f%n%nCÍRCULO%nÁrea: %f%nPerímetro: %f",
            square.area(), square.perimeter(),
            circle.area(), circle.perimeter()
        );
    }
}
