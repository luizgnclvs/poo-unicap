package question1;

public class Assistant extends Employee {
    private int registry;

    public Assistant () {}

    public Assistant (String name, double salary, int registry) {
        super(name, salary);
        this.registry = registry;
    }

    public int getRegistry () {
        return this.registry;
    }

    public void setRegistry (int registry) {
        this.registry = registry;
    }

    @Override
    public void showData () {
        System.out.println("Funcionário " + super.getName() + ", de matrícula " + this.registry + " e salário R$" + super.getSalary());
    }
}
