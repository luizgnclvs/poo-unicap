package pckg;

public class Programmer extends Employee {

    public Programmer () {}

    public Programmer (String name, double salary) {
        super(name, salary);
    }

    @Override
    public void raiseSalary () {
        super.setSalary(super.getSalary() * 1.2);
    }
}
