package pckg2.exceptions;

public class RepositoryException extends Exception {

    public RepositoryException () {
        super("Não foi possível cadastrar este item no repositório.");
    }
}
