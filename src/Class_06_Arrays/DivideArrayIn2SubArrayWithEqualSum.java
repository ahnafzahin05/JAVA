package Class_06_Arrays;

public class DivideArrayIn2SubArrayWithEqualSum {
    public static void main(String[] args) {
        int[] arr = {3,4,-2,5,8,20,-10,8};
        System.out.println(equalSumSubArray(arr));
    }

    private static boolean equalSumSubArray(int[] arr) {
        int n = arr.length;
        int totalSum = 0;
        for(int i=0; i<n; i++){
            totalSum+=arr[i];
        }
        int prefixSum = 0;
        for(int i=0; i<n; i++){
            prefixSum+=arr[i];
            int rightSum = totalSum - prefixSum;
            if(prefixSum == rightSum) return true;
        }
        return false;
    }
}
