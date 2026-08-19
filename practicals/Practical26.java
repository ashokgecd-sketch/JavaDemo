interface Classify26 {
    String getDivision(double average);
}

class Result26 implements Classify26 {
    public String getDivision(double a) {
        return a >= 60 ? "First Division" : "Second Division";
    }
}

public class Practical26 {
    public static void main(String[] a) {
        System.out.println(new Result26().getDivision(68));
    }
}
