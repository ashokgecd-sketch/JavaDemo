import java.util.*;

public class Practical7 {
    public static void main(String[] x) {
        Scanner s = new Scanner(System.in);
        System.out.print("Three sides: ");
        double a = s.nextDouble(), b = s.nextDouble(), c = s.nextDouble();
        if (a + b <= c || a + c <= b || b + c <= a)
            System.out.println("Invalid triangle.");
        else {
            double p = (a + b + c) / 2;
            System.out.printf("Area: %.2f%n", Math.sqrt(p * (p - a) * (p - b) * (p - c)));
        }
    }
}
