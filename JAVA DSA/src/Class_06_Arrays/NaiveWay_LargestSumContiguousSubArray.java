package Class_06_Arrays;

public class NaiveWay_LargestSumContiguousSubArray {
    public static void main(String[] args) {
        int[] arr = {2,3,-8,7,-1,2,3};
        System.out.println(largestSumSubArray(arr));
    }

    private static int largestSumSubArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int pre = 0;
        for(int i=0; i<arr.length; i++){
            pre = 0;
            for(int j=i; j<arr.length; j++){
                pre+=arr[j];
                maxSum = Integer.max(pre,maxSum);
            }
        }
        return maxSum;
    }
}
