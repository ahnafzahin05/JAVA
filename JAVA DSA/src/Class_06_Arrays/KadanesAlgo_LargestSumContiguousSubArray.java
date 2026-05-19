package Class_06_Arrays;

public class KadanesAlgo_LargestSumContiguousSubArray {
    public static void main(String[] args) {
        int[] arr = {2,3,-8,7,-1,2,3};
        System.out.println(largestSumSubArray(arr));
    }

    private static int largestSumSubArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int pre = 0;
        for(int i=0; i<arr.length; i++){
            pre+=arr[i];
            maxSum = Integer.max(maxSum,pre);
            if(pre<0) pre = 0;
        }
        return maxSum;
    }
}
