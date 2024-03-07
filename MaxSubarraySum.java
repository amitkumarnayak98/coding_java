import java.util.Scanner;

public class MaxSubarraySum {

    /**
     * Calculate the sum of all elements of the array
     * 
     * @param arr Entered array by the user
     * @return
     */
    public static int maxSubarraySum(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // Choose between extending the current subarray or starting a new sub array
            currentSum = Math.max(currentSum + arr[i], arr[i]);

            // Update the maximum sum if the current sum is greater
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }

    /**
     * Print all the array of the elements. For Ex. 1 2 3 4 5
     * 
     * @param arr Entered array by the user
     */
    public static int printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Invalid state. Please enter a positive size.");
            return;
        }

        int[] arr = new int[N];

        // Get the user input for each element of the array
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < N; i++) {
            System.out.print("Enter elements " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println();

        // Print the entered array
        System.out.print("Entered array[]: ");
        printArray(arr);
        System.out.println();

        // Measure the execution time
        long startTime = System.currentTimeMillis();

        // Print the maxSum
        int maxSum = maxSubarraySum(arr);

        // Measure the execution time
        long endTime = System.currentTimeMillis();

        System.out.println();
        System.out.print("Max subarray sum is " + maxSum + " of elements ");
        printArray(arr);
        System.out.print("which is a contiguous subarray");

        System.out.println();
        System.out.println();

        // Print the execution time
        long executionTime = endTime - startTime;
        System.out.println("Execution time: " + executionTime + " milliseconds");
    }
}