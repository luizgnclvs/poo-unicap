package pckg2;

import pckg2.exceptions.NonexistentElementException;
import pckg2.exceptions.PreexistingElementException;
import pckg2.exceptions.RepositoryException;

public class AccountRegistration {
    private static Account [] repository = new Account [2];
    private static int slot = 0;

    public static void insert (Account newAccount) throws RepositoryException, PreexistingElementException {
        if (slot >= repository.length) {
            throw new RepositoryException();
        } else {
            for (Account account : repository) {
                if (newAccount.getNumber() == account.getNumber()) {
                    throw new PreexistingElementException("Uma conta com este mesmo número já encontra-se no repositório.");
                }
            }

            repository[slot] = newAccount;
            slot++;
        }
    }

    public static Account search (int accountNumber) throws NonexistentElementException {
        for (Account account : repository) {
            if (account.getNumber() == accountNumber) {
                return account;
            }
        }

        throw new NonexistentElementException("Não foi encontrado nenhuma conta com essa identificação.");
    }

    public static void main(String[] args) {
        
    }
}
