import java.util.*;

public class Practical44 {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        System.out.print("Sentence: ");
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String w : s.nextLine().split("\\s+"))
            map.put(w, map.getOrDefault(w, 0) + 1);
        map.forEach((w, n) -> System.out.println(w + " -> " + n));
    }
}
