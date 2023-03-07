package exceptions;

public class RepositoryException extends Exception {

    public RepositoryException () {
        super("O repositório está lotado. Não será possível cadastrar mais nenhuma conta.");
    }
}
