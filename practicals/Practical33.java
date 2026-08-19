class NotSufficientFundException extends Exception {
    NotSufficientFundException() {
        super("Not Sufficient Fund");
    }
}

class BankAccount33 {
    double balance = 1000;

    void deposit(double x) {
        balance += x;
    }

    void withdraw(double x) throws NotSufficientFundException {
        if (x > balance)
            throw new NotSufficientFundException();
        balance -= x;
        System.out.println("Withdrawn " + x + ", balance: " + balance);
    }
}

public class Practical33 {
    public static void main(String[] a) {
        BankAccount33 b = new BankAccount33();
        b.deposit(1000);
        try {
            b.withdraw(400);
            b.withdraw(300);
            b.withdraw(500);
        } catch (NotSufficientFundException e) {
            System.out.println(e.getMessage());
        }
    }
}
