package Class_06_Arrays;

import java.util.Arrays;

public class ThreeSum_n2 {
    public static void main(String[] args) {
        int[] arr = {1,4,6,8,10,45};
        int target = 24;
        System.out.println(soln(arr,target));
    }

    private static boolean soln(int[] arr, int target) {
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0; i<n-2; i++){
            int ans = target - arr[i];
            int left = i+1, right = n-1;
            while(left<right){
                if(arr[left]+arr[right] == ans) return true;
                else if(arr[left]+arr[right] < ans) left++;
                else right--;
            }
        }
        return false;
    }
}
