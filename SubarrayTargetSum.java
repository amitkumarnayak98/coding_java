import java.util.Scanner;

public class SubarrayTargetSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the range
        System.out.print("Enter the range (up to which number): ");
        int n = scanner.nextInt();

        // Validate input to ensure it's not negative
        if (n <= 0) {
            System.out.println("Please enter a positive number for the range.");
            return;  // Exit the program
        }

        // Get user input for the target sum
        System.out.print("Enter the target sum: ");
        int targetSum = scanner.nextInt();

        // Sliding window approach
        int[] numbers = new int[n];
        for (int i = 0; i < n; ++i) {
            numbers[i] = i + 1;
        }

        int start = 0, end = 0, currentSum = 0;

        while (end < n) {
            currentSum += numbers[end];

            while (currentSum > targetSum && start <= end) {
                currentSum -= numbers[start];
                start++;
            }

            if (currentSum == targetSum) {
                System.out.println("The sum of elements from" +" "+ numbers[start] +" "+ "position to" +" "+ numbers[end] +" "+ "position is" +" "+ targetSum);
                return;  // Exit the program with success
            }

            end++;
        }

        // If no subarray is found, print an array consisting only of -1
        System.out.println("-1");
    }
}
