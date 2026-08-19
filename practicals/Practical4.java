import java.util.*;

public class Practical4 {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        System.out.print("Weight (lb), height (in): ");
        double kg = s.nextDouble() * .45359237, m = s.nextDouble() * .0254;
        System.out.printf("BMI: %.2f%n", kg / (m * m));
    }
}
