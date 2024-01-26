import java.util.Scanner;


public class SimpleCalculator {

    /** Method for addition */
    private static double add (double a, double b) {
        return a + b;
    }

    /** Method for subtraction */
    private static double subtract (double a, double b) {
        return a - b;
    }

    /** Method for multiplication */
    private static double multiply (double a, double b) {
        return a * b;
    }

    /** Method for division */
    private static double divide (double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            System.exit(1); // Exit with an error code
            return 0; // Unreachable, but needed to compile
        }
    }

    /** Method for power */
    private static double power (double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Input
        System.out.print("Enter an operator (+, -, *, /, ^): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter two numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        double result;

        // Calculation

        switch (operator) {
            case '+':
                result = add(num1, num2);
                break;
            
            case '-':
                result = subtract(num1, num2);
                break;
            
            case '*':
                result = multiply(num1, num2);
                break;

            case '/':
                result = divide(num1, num2);
                break;

            case '^':
                result = power(num1, num2);
                break;

            default:
                System.out.println("Error: Invalid operator.");
                return; //Exit without an error code

        }

        // Output
        System.out.println("Result: " + result);
    }
}