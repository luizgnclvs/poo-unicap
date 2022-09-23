package pckg;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            int employeeRegistration, departmentCode;
            String employeeName, departmentName;

            System.out.println("Olá! Vamos preencher as informações para o cadastro do funcionário.");

            System.out.print("\nMatrícula do funcionário: ");
            employeeRegistration = read.nextInt();
            read.nextLine();

            System.out.print("Nome do funcionário: ");
            employeeName = read.nextLine();

            System.out.println("\nAgora vamos para as informações do departamento do funcionário.");

            System.out.print("Código do departamento: ");
            departmentCode = read.nextInt();
            read.nextLine();

            System.out.print("Nome do departamento: ");
            departmentName = read.nextLine();

            System.out.println();

            Department department = new Department(departmentCode, departmentName);
            Employee employee = new Employee(employeeRegistration, employeeName, department);

            System.out.print("\n" + employee.toString());
        }
    }
}
