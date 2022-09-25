package question2;

public class Test {

    public static void main(String[] args) {
        GeometricShape square = new Square(5.5);
        GeometricShape circle = new Circle(3.7);
        GeometricShape rectangle = new Rectangle(4.6, 8.9);

        System.out.printf(
            "%nQUADRADO%nÁrea: %f%nPerímetro: %f%n%nCÍRCULO%nÁrea: %f%nPerímetro: %f%n%nRETÂNGULO%nÁrea: %f%nPerímetro: %f%n",
            square.area(), square.perimeter(),
            circle.area(), circle.perimeter(),
            rectangle.area(), rectangle.perimeter()
        );
    }
}
