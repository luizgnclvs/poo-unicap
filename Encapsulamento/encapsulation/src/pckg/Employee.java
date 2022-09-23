package pckg;

public class Employee {
    private int registration;
    private String name;
    private Department department;

    public Employee () {}

    public Employee (int registration, String name, Department department) {
        this.setRegistration(registration);
        this.setName(name);
        this.setDepartment(department);
    }

    public int getRegistration () {
        return this.registration;
    }

    public void setRegistration (int registration) {
        if (registration >= 0) {
            this.registration = registration;
        } else {
            System.out.println("A matrícula não pode ser um número menor que zero");
        }
    }

    public String getName () {
        return this.name;
    }

    public void setName (String name) {
        name = name.trim();

        if (!name.equals(null) && !name.equals("")) {
            this.name = name;
        } else {
            System.out.println("O nome inserido não pode estar vazio.");
        }
    }

    public Department getDepartment () {
        return this.department;
    }

    public void setDepartment (Department department) {
        this.department = department;
    }

    public String toString () {
        return "Matrícula: " + this.registration + "\nNome: " + this.name + "\n\nDepartamento:\n" + this.department.toString();
    }
}
