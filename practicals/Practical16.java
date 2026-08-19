class LoanCalculator {
    double calculateEMI(int p, int t, float r) {
        return emi(p, t, r);
    }

    double calculateEMI(double p, int t, double r) {
        return emi(p, t, r);
    }

    double calculateEMI(int p, int t) {
        return emi(p, t, 10);
    }

    private double emi(double p, int years, double rate) {
        double q = rate / 1200, n = years * 12;
        return p * q * Math.pow(1 + q, n) / (Math.pow(1 + q, n) - 1);
    }
}

public class Practical16 {
    public static void main(String[] a) {
        LoanCalculator l = new LoanCalculator();
        System.out.printf("%.2f %.2f %.2f%n", l.calculateEMI(1000000, 20, 7.5f), l.calculateEMI(500000, 5, 9.0),
                l.calculateEMI(100000, 2));
    }
}
