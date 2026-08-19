class BankAccount23 {
    String accountNumber, accountHolderName;
    double balance;

    BankAccount23(String n, String h, double b) {
        accountNumber = n;
        accountHolderName = h;
        balance = b;
    }

    void openAccount() {
        System.out.println("Opened: " + accountNumber);
    }

    void deposit(double x) {
        balance += x;
    }

    boolean withdraw(double x) {
        if (x > balance)
            return false;
        balance -= x;
        return true;
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends BankAccount23 {
    SavingAccount(String n, String h, double b) {
        super(n, h, b);
    }

    double calculateInterest() {
        return balance * .04;
    }
}

class FixedDepositAccount extends BankAccount23 {
    int years;

    FixedDepositAccount(String n, String h, double b, int y) {
        super(n, h, b);
        years = y;
    }

    double maturityAmount() {
        return balance * Math.pow(1.07, years);
    }
}

public class Practical23 {
    public static void main(String[] a) {
        SavingAccount s = new SavingAccount("S1", "Asha", 10000);
        s.openAccount();
        s.deposit(500);
        s.checkBalance();
        System.out.println("Interest: " + s.calculateInterest());
        FixedDepositAccount f = new FixedDepositAccount("F1", "Raj", 20000, 2);
        System.out.println("Maturity: " + f.maturityAmount());
    }
}
