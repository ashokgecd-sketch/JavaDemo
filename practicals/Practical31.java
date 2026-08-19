class VotingApp {
    void checkEligibility(int age) {
        if (age < 18)
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        System.out.println("Eligible to vote");
    }
}

public class Practical31 {
    public static void main(String[] a) {
        for (int age : new int[] { 17, 20 })
            try {
                new VotingApp().checkEligibility(age);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Validation process completed");
            }
    }
}
