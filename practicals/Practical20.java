import java.util.*;

public class Practical20 {
    static boolean isValidPassword(String p) {
        if (p.length() < 8 || !p.matches("[A-Za-z0-9]+"))
            return false;
        int n = 0;
        for (char c : p.toCharArray())
            if (Character.isDigit(c))
                n++;
        return n >= 2;
    }

    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        System.out.print("Password: ");
        System.out.println(isValidPassword(s.nextLine()) ? "Valid Password" : "Invalid Password");
    }
}
