public class CommonFunctions {
    /**
     * Print all the array of the elements. For Ex. 1 2 3 4 5
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
     * Find the missing number for sequence of arrays. For Ex. 1 2 3 4 5
     * 
     * @param arr Entered array by the user
     * @param N   Entered range from the user
     */
    public static int MissingNumber(int[] arr, int N) {
        int totalXOR = 0;
        int arrXOR = 0;

        // XOR of all elements from 1 to range (i.e given N from the user input)
        for (int i = 0; i <= N + 1; i++) {
            totalXOR ^= i;
        }

        // XOR of all array elements
        for (int num : arr) {
            arrXOR ^= num;
        }

        // XOR of the missing number
        return totalXOR ^ arrXOR;
    }

}
