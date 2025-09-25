package Class_06_Arrays;

public class PrintingAllSubArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        subArray(arr);
    }

//    Iterative Approach
//    To generate a subarray, we need a starting index from the original array. For choosing the starting index, we can run a loop from [0 to n-1] and consider each i as the starting index. For each starting index i, we can select an ending index from the range [i to n-1]. A nested loop from [i to n-1] will help in selecting the ending index. Once we have the starting and ending indices, we need an innermost loop to print the elements in this subarray.
//
//    Outermost Loop: Picks starting index of current subarray
//    Middle Loop: Picks ending index of current subarray
//    Innermost Loop: Prints the subarray from the starting index to the ending index

    private static void subArray(int[] arr) {
        int n = arr.length;

        // Pick starting point
        for (int i = 0; i < n; i++) {

            // Pick ending point
            for (int j = i; j < n; j++) {

                // Print subarray between current starting and ending points
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
