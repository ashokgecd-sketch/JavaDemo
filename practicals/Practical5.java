import java.util.*;

public class Practical5 {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        System.out.print("Amount: ");
        int n = s.nextInt();
        for (int d : new int[] { 100, 50, 10, 5, 2, 1 }) {
            System.out.println(d + " notes: " + n / d);
            n %= d;
        }
    }
}
