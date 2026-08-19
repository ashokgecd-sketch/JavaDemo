class Table {
    synchronized void print(int n) {
        for (int i = 1; i <= 10; i++)
            System.out.println(n + " x " + i + " = " + n * i);
    }
}

public class Practical37 {
    public static void main(String[] a) {
        Table t = new Table();
        new Thread(() -> t.print(5)).start();
        new Thread(() -> t.print(7)).start();
    }
}
