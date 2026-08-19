import java.util.*;

class Employee10 {
    private String employeeName;
    private double employeeSalary;

    void readEmployeeData() {
        Scanner s = new Scanner(System.in);
        System.out.print("Name: ");
        employeeName = s.nextLine();
        System.out.print("Salary: ");
        employeeSalary = s.nextDouble();
    }

    void displayEmployeeData() {
        System.out.printf("Name: %s, Salary: %.2f%n", employeeName, employeeSalary);
    }
}

public class Practical10 {
    public static void main(String[] a) {
        Employee10 e = new Employee10();
        e.readEmployeeData();
        e.displayEmployeeData();
    }
}
