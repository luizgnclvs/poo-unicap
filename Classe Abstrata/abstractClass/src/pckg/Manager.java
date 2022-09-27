package pckg;

public class Manager extends Employee {

    public Manager () {}

    public Manager (String name, double salary) {
        super(name, salary);
    }

    public void raiseSalary () {
        super.setSalary(super.getSalary() * 1.1);
    }
}
