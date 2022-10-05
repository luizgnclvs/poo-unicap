package pckg3;

public class Test {

    public static void main(String[] args) {
        Account account = new Account("Luiz", 1, 850, 1500, 0);
        Account specialAccount = new SpecialAccount("Felipe", 2, 1200.50, 1500, 0);

        System.out.printf(
            "%nSalário do Cliente (Conta Comum): R$ %.2f %nSalário do Cliente (Conta Especial): R$ %.2f" + 
            "%nLimite (Conta Comum): R$ %.2f %nLimite (Conta Especial): R$ %.2f",
            account.getClientSalary(), specialAccount.getClientSalary(),
            account.getLimit(), specialAccount.getLimit()
        );

        System.out.println("\n\nSettando os limites para o valor dos salários dos clientes...");

        account.setLimit(account.getClientSalary());
        specialAccount.setLimit(specialAccount.getClientSalary());

        System.out.printf(
            "%nNovos limites: %nConta Comum: R$ %.2f %nConta Especial: R$ %.2f",
            account.getLimit(), specialAccount.getLimit()
        );

        System.out.println("\n\nSettando os limites para acima do valor dos salários dos clientes...");

        account.setLimit(account.getClientSalary() + 1);
        specialAccount.setLimit(specialAccount.getClientSalary() + 1);

        System.out.printf(
            "%nNovos limites: %nConta Comum: R$ %.2f %nConta Especial: R$ %.2f",
            account.getLimit(), specialAccount.getLimit()
        );

        System.out.println("\n\nSettando o limite da Conta Especial para três vezes o salário do cliente...");

        specialAccount.setLimit(specialAccount.getClientSalary() * 3);

        System.out.printf(
            "%nLimite da Conta Especial: R$ %.2f", specialAccount.getLimit()
        );

        System.out.println("\n\nSettando o limite da Conta Especial para acima do triplo do salário do cliente...");

        specialAccount.setLimit((specialAccount.getClientSalary() * 3) + 1);

        System.out.printf(
            "%nLimite da Conta Especial: R$ %.2f", specialAccount.getLimit()
        );
    }
}
