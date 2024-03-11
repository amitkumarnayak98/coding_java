import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Invalid state. Please enter a positive number for size");
            return;
        }

        int[] arr = new int[N - 1];

        // Get the user input for each element of the array
        System.out.println("Enter the element of the array");
        for (int i = 0; i < N - 1; i++) {
            System.out.print("Enter elements " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Entered array[]: ");
        CommonFunctions.printArray(arr);
        System.out.println();

        // Measure the execution time
        double startTime = System.currentTimeMillis();

        // Common function MissingNumber is imported from CommonFunctions.java file
        int missingNumber = CommonFunctions.MissingNumber(arr, N - 1);

        // Measure the execution time
        double endTime = System.currentTimeMillis();

        System.out.println("Missing number is " + missingNumber);

        double executionTime = endTime - startTime;
        System.out.println("Execution time: " + executionTime + " milliseconds");
    }
}