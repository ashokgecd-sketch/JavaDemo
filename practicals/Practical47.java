import java.util.*;

public class Practical47 {
    public static void main(String[] a) {
        LinkedList<String> p = new LinkedList<>(Arrays.asList("Song A", "Song B", "Song C"));
        System.out.println(p);
        System.out.println("Playing: " + p.removeFirst());
        System.out.println(p);
        System.out.println("Skipped: " + p.removeLast());
        System.out.println(p);
    }
}
