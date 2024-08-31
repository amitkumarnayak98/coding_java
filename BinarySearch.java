import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {

    /**
     * Print all the array of the elements. For Ex. [1,2,3,4,5]
     * 
     * @param arr Entered array by the user
     */
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int num : arr) {
            System.out.print(num + (num == arr[arr.length - 1] ? "" : ", "));
        }
        System.out.print("] ");
    }

    /**
     * To sort the elements of the array. For Ex. [1,2,3,4,5]
     * 
     * @param arr Entered array by the user
     * @param n   the size of the array
     */
    public static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and array[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * To perform binary search on the array.
     * 
     * @param arr    Entered array by the user
     * @param target the value to be searched across the complete array
     */

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        if (left <= right) {
            int mid = left + ((right - left) / 2);

            // Check if the target is present at the mid
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                // If target is greater than mid then no need to consider the left half of the
                // array
                return left = mid + 1;
            } else {
                // If target is lesser than the mid then no need to consider the right half of
                // the array
                return right = mid - 1;
            }
        } else {

            // If the target is not found in the array then
            return -1;
        }
    }

    public static int getIndexOfElement(int[] arr, int n, int target) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid state. Please enter a positive size.");
            return;
        }

        int[] arr = new int[n];

        // Get the user input for each element of the array
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter elements " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println();

        // Print the entered array
        System.out.print("Entered array[]: ");
        printArray(arr);
        System.out.println();

        // Sorting the array in ascending order
        // Arrays.sort(arr);
        bubbleSort(arr, n);

        // Printing the sorted array
        System.out.print("Sorted array[]: ");
        printArray(arr);

        System.out.println();
        // Taking input from the user for the desired element to search in the array
        System.out.print("Enter the element to search for: ");
        int target = sc.nextInt();

        int result = binarySearch(arr, target);
        int e = getIndexOfElement(arr, n, target);

        // Display the result
        if (result != -1 && e != -1) {
            System.out.print("Element " + target + " is found at " + e);
        } else {
            System.out.print("Element not found in the array.");
        }
    }
}