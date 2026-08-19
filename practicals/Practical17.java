class University {
    static int totalStudents;
    static String universityName;
    static {
        universityName = "GEC Dahod";
        System.out.println("Static block: " + universityName);
    }
    {
        System.out.println("Instance block: student created");
    }

    University() {
        totalStudents++;
    }

    static int getTotalStudents() {
        return totalStudents;
    }
}

public class Practical17 {
    public static void main(String[] a) {
        new University();
        new University();
        System.out.println("Total: " + University.getTotalStudents());
    }
}
