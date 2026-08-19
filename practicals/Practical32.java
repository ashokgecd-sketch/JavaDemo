public class Practical32 {
    static double average(String[] v) throws NullPointerException, NumberFormatException {
        double s = 0;
        for (String x : v) {
            if (x == null)
                throw new NullPointerException("Null value");
            s += Double.parseDouble(x);
        }
        return s / v.length;
    }

    public static void main(String[] a) {
        for (String[] v : new String[][] { { "1.5", "2.5" }, { "1", "abc" }, { "1", null } })
            try {
                System.out.println("Average: " + average(v));
            } catch (RuntimeException e) {
                System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
            } finally {
                System.out.println("Attempt complete");
            }
    }
}
