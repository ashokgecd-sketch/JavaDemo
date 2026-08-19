package exam;

import student.Student;

public class Result extends Student {
    private double marks1, marks2, marks3;

    public Result(int r, String n, double a, double b, double c) {
        super(r, n);
        marks1 = a;
        marks2 = b;
        marks3 = c;
    }

    public void displayResult() {
        displayStudent();
        double total = marks1 + marks2 + marks3;
        System.out.printf("Marks: %.1f, %.1f, %.1f%nTotal: %.1f, Average: %.2f%n", marks1, marks2, marks3, total,
                total / 3);
    }
}
