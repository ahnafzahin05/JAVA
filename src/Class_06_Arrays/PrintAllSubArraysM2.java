package Class_06_Arrays;

public class PrintAllSubArraysM2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        subArray(arr);
    }
    private static void subArray(int[] arr) {
        int n = arr.length;
        System.out.println("Array: [1, 2, 3, 4]\n");

        // Outer loop: subarray size (1, 2, 3, ..., n)
        for (int size = 1; size <= n; size++) {
            // Middle loop: starting position
            // We can start from 0 to (n - size) because we need 'size' elements
            for (int start = 0; start <= n - size; start++) {
                int end = start + size - 1;  // Calculate ending position

                // Inner loop: print elements from start to end
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println(); // Extra line for readability
        }
    }
}
