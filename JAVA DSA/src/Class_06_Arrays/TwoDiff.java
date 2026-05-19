package Class_06_Arrays;

import java.util.Arrays;

public class TwoDiff {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 0;
        System.out.println(twoDiff(arr, target));
    }

    private static boolean twoDiff(int[] arr, int target) {
        Arrays.sort(arr); // 2,3,5,10,50,80
        int start = 0, end = 1;
        while(end < arr.length){
            int diff = arr[end] - arr[start];
            if(diff == target) return true;
            else if(diff < target) end++;
            else {
                start++;
                if(start==end) end++; // Ensure left != right
            }
        }
        return false;
    }
}
