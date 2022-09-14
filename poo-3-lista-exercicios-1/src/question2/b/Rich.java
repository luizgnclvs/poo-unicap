package question2.b;

public class Rich extends Person {
    private double money;

    public Rich () {}

    public Rich (String name, int age, double money) {
        super(name, age);
        this.money = money;
    }

    public double getMoney () {
        return this.money;
    }

    public void setMoney (double money) {
        this.money = money;
    }

    public void shop () {
        System.out.println(super.getName() + " está fazendo compras.");
    }
}
