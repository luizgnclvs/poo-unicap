package pckg4;

public class Application {

    public static void main(String[] args) {
        double x = 6;
        double y = 7.3;

        MathematicalOperation addition = new Addition();
        MathematicalOperation subtraction = new Subtraction();
        MathematicalOperation multiplication = new Multiplication();
        MathematicalOperation division = new Division();

        System.out.println(addition.calculate(x, y));
        System.out.println(subtraction.calculate(x, y));
        System.out.println(multiplication.calculate(x, y));
        System.out.println(division.calculate(x, y));
    }
}
