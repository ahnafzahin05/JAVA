package Class_06_Arrays;

import java.util.Arrays;

public class PairSumClosestTo0 {
    public static void main(String[] args) {
        int[] arr = {-21,-67,-37,-18,4,-65};
        int n = arr.length;
        System.out.println(closestToZero(arr,n));
    }

    private static int closestToZero(int[] arr, int n) {
        int target = 0;
        Arrays.sort(arr);
        return 0;
    }
}
