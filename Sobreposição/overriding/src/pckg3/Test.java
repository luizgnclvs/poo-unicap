package pckg3;

public class Test {

    public static void main(String[] args) {
        Account account = new Account("Luiz", 1, 850, 1500, 1500);
        Account specialAccount = new SpecialAccount("Felipe", 2, 1200.50, 1500, 1500);

        System.out.println(account.getLimit());
        System.out.println(specialAccount.getLimit());

        account.setLimit(1501);
        specialAccount.setLimit(1501);

        System.out.println(account.getLimit());
        System.out.println(specialAccount.getLimit());

        specialAccount.setLimit(4501);

        System.out.println(specialAccount.getLimit());
    }
}
