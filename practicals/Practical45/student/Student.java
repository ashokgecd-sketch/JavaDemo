package student;

public class Student {
    protected int rollNo;
    protected String name;

    public Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    public void displayStudent() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
    }
}
