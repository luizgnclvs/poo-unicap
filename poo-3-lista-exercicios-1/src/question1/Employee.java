package question1;

public class Employee {
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

    public void addRaise (double raise) {
        this.salary += raise;
    }

    public double annualPay () {
        return this.salary * 12;
    }

    public void showData () {
        System.out.println("Funcionário " + this.name + ", de salário R$" + this.salary);
    }
}
