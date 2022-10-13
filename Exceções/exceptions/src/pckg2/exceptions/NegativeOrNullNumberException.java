package pckg2.exceptions;

public class NegativeOrNullNumberException extends InvalidDataException {

    public NegativeOrNullNumberException () {
        super("O número inserido é negativo ou nulo");
    }
}
