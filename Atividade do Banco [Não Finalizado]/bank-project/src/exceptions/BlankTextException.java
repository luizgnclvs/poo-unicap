package exceptions;

public class BlankTextException extends InvalidDataException {

    public BlankTextException () {
        super("O texto inserido é nulo ou está em branco.");
    }
}
