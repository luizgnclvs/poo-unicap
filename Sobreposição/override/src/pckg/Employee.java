package pckg;

public abstract class Employee {
    private String name;
    private double salary;

    public Employee () {}

    public Employee (String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName () {
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public double getSalary () {
        return this.salary;
    }

    public void setSalary (double salary) {
        this.salary = salary;
    }

    public void raiseSalary () {
        this.setSalary(this.salary * 1.05);
    }

    public String toString () {
        return "Nome: " + this.name + "\nSalário: " + this.salary;
    }
}
