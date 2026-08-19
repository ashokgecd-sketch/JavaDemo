import java.util.*;

public class Practical49 {
    static <T> boolean searchElement(LinkedList<T> x, T e) {
        return x.contains(e);
    }

    public static void main(String[] a) {
        System.out.println(searchElement(new LinkedList<>(Arrays.asList(1, 2, 3)), 2));
        System.out.println(searchElement(new LinkedList<>(Arrays.asList("Asha", "Raj")), "Mira"));
    }
}
