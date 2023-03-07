package exceptions;

public class NonexistentElementException extends Exception {

    public NonexistentElementException () {
        super("Não foi encontrado nenhuma conta com essa identificação presente no repositório.");
    }
}
