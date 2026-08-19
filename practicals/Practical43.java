import java.util.*;

public class Practical43 {
    public static void main(String[] a) {
        ArrayList<Integer> m = new ArrayList<>(Arrays.asList(72, 88, 65, 91, 79));
        System.out.println(m);
        System.out.println("Highest: " + Collections.max(m));
        System.out.println("Lowest: " + Collections.min(m));
    }
}
