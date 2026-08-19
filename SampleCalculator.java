import java.util.Scanner;

public class SampleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Simple Calculator");
        System.out.println("-------------------");

        // Get first number
        System.out.print("\nEnter first number: ");
        double num1 = getValidDoubleInput(scanner);

        // Get operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        while (!isValidOperator(operator)) {
            System.out.println("Invalid operator! Please enter a valid operator (+, -, *, /):");
            operator = scanner.next().charAt(0);
        }

        // Get second number
        System.out.print("Enter second number: ");
        double num2 = getValidDoubleInput(scanner);

        // Perform calculation
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed!");
                    return; // Exit program
                }
                result = num1 / num2;
                break;
            default:
                // Should not reach here due to operator validation
                result = 0;
        }

        // Display result
        displayResult(num1, num2, operator, result);
    }

    private static double getValidDoubleInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input! Please enter a valid number: ");
            scanner.next(); // Clear invalid input
        }
        return scanner.nextDouble();
    }

    private static boolean isValidOperator(char operator) {
        return operator == '+' || operator == '-' || operator == '*' || operator == '/';
    }

    private static void displayResult(double num1, double num2, char operator, double result) {
        System.out.println("\nCalculation performed:");
        System.out.println(num1 + " " + operator + " " + num2 + " = ");
        
        // Show more decimal places for precision
        String formattedResult;
        if (Double.isInteger(result)) {
            formattedResult = String.format("%.0f", result);
        } else {
            formattedResult = String.format("%.6f", result); // Limit to 6 decimal places
        }
        
        System.out.println(formattedResult + "\n");
    }
}
