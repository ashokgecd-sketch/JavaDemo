class SumThread extends Thread {
    int from, to;
    long sum;

    SumThread(int f, int t) {
        from = f;
        to = t;
    }

    public void run() {
        for (int i = from; i <= to; i++)
            sum += i;
    }

    long getSum() {
        return sum;
    }
}

public class Practical38 {
    public static void main(String[] a) throws InterruptedException {
        SumThread a1 = new SumThread(1, 1000), a2 = new SumThread(1001, 2000);
        a1.start();
        a2.start();
        a1.join();
        a2.join();
        System.out.println("Total: " + (a1.getSum() + a2.getSum()));
    }
}
