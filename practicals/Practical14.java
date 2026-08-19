import java.util.*;

class BankAccount14 {
    String accountId, accountHolderName;
    double balance;

    void assignValues(String id, String name, double b) {
        accountId = id;
        accountHolderName = name;
        balance = b;
    }

    void displayValues() {
        System.out.printf("%s | %s | %.2f%n", accountId, accountHolderName, balance);
    }
}

public class Practical14 {
    public static void main(String[] a) {
        BankAccount14[] accounts = new BankAccount14[5];
        for (int i = 0; i < 5; i++) {
            accounts[i] = new BankAccount14();
            accounts[i].assignValues("A" + (i + 1), "Holder " + (i + 1), 1000 * (i + 1));
            accounts[i].displayValues();
        }
        Scanner s = new Scanner(System.in);
        System.out.print("Search ID: ");
        String id = s.nextLine();
        for (BankAccount14 x : accounts)
            if (x.accountId.equals(id)) {
                x.displayValues();
                return;
            }
        System.out.println("Account not found.");
    }
}
