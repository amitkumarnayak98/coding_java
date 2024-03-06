import java.util.Arrays;
import java.util.Scanner;

public class TripletCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input for the size of the array
        System.out.println("Enter the size of the array: ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Invalid size. Please enter a positive size.");
            return;
        }

        int[] arr = new int[N];

        // Get user input for each element of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        // Measure the execution time
        long startTime = System.currentTimeMillis();

        // Call the function or perform the computation
        int tripletsCount = countTriplets(arr);

        // Measure the execution time
        long endTime = System.currentTimeMillis();

        // Print the enetered array
        System.out.print("Entered array[]: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Print the count of the triplets with the required sum
        System.out.println("Triplet count: " + tripletsCount);

        // Print the execution time
        long executionTime = endTime - startTime;
        System.out.print("Execution time: " + executionTime + "milliseconds");
    }

    static int countTriplets(int arr[]) {
        Arrays.sort(arr);
        int tripletCount = 0;

        for (int i = arr.length - 1; i >= 2; i--) {
            int left = 0;
            int right = i - 1;

            while (left < right) {
                if (arr[left] + arr[right] == arr[i]) {
                    tripletCount++;
                    left++;
                    right--;
                } else if (arr[left] + arr[right] < arr[i]) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return tripletCount;
    }
}
