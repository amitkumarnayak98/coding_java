import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /** Get user input for the range */
        System.out.println("Enter the range (up to which number): ");
        int n = scanner.nextInt();

        /** Validate input to ensure it's not negative */
        if (n <= 0) {
            System.out.println("Please enter a positive number for range.");
            System.exit(1); // Exit with an error code
        }

        /** Define an array with size n */
        int[] numbers = new int[n];

        /** Initialize the array with numbers from 1 to n */
        for (int i = 0; i < n; ++i) {
            numbers[i] = i + 1;
        }

        /** Print the array element */
        System.out.print("Array elements: ");
        for (int i = 0; i < n; ++i) {
            System.out.print(numbers[i] + " ");
        }
    }
}