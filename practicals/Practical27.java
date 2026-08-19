interface Exam27 {
    boolean isPassed(int mark);
}

interface Classify27 {
    String getDivision(double average);
}

class Result27 implements Exam27, Classify27 {
    public boolean isPassed(int m) {
        return m >= 40;
    }

    public String getDivision(double a) {
        return a >= 60 ? "First Division" : a >= 40 ? "Second Division" : "Fail";
    }
}

public class Practical27 {
    public static void main(String[] a) {
        Result27 r = new Result27();
        System.out.println("Passed: " + r.isPassed(66));
        System.out.println(r.getDivision(66));
    }
}
