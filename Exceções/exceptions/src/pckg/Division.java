package pckg;

public class Division {

    public static void calculate (double dividend, double divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Zero não é um divisor válido.");
        } else {
            System.out.println("Resultado da divisão = " + (dividend / divisor) + ".");
        }
    }
}
