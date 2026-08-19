import java.io.*;

public class Practical39 {
    public static void main(String[] a) {
        if (a.length != 1) {
            System.out.println("Usage: java Practical39 file");
            return;
        }
        int lines = 0, words = 0, chars = 0;
        try (BufferedReader r = new BufferedReader(new FileReader(a[0]))) {
            String x;
            while ((x = r.readLine()) != null) {
                lines++;
                chars += x.length();
                if (!x.trim().isEmpty())
                    words += x.trim().split("\\s+").length;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.printf("Characters: %d%nWords: %d%nLines: %d%n", chars, words, lines);
    }
}
