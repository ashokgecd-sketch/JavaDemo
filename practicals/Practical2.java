import java.util.*;

public class Practical2 {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a b c d e f: ");
        double a = s.nextDouble(), b = s.nextDouble(), c = s.nextDouble(), d = s.nextDouble(), e = s.nextDouble(),
                f = s.nextDouble();
        double D = a * d - b * c;
        if (D == 0)
            System.out.println("The equations have no unique solution.");
        else
            System.out.printf("x = %.2f, y = %.2f%n", (e * d - b * f) / D, (a * f - e * c) / D);
    }
}
