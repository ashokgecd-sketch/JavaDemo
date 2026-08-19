import java.util.*;

class College {
    String collegeName;

    College(String n) {
        collegeName = n;
    }

    class Admission {
        String studentName, course;

        void accept() {
            Scanner s = new Scanner(System.in);
            System.out.print("Student name: ");
            studentName = s.nextLine();
            System.out.print("Course: ");
            course = s.nextLine();
        }

        void display() {
            System.out.println(studentName + " admitted to " + course + " at " + collegeName);
        }
    }
}

public class Practical19 {
    public static void main(String[] a) {
        College c = new College("GEC Dahod");
        College.Admission x = c.new Admission();
        x.accept();
        x.display();
    }
}
