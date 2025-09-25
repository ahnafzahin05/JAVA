package Class_06_Arrays;

public class KadanesAlgo_LargestSumContiguousSubArray {
    public static void main(String[] args) {
        int[] arr = {2,3,-8,7,-1,2,3};
        System.out.println(largestSumSubArray(arr));
    }

    private static int largestSumSubArray(int[] arr) {
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(prefixSum[i]>max) max = prefixSum[i];
        }
        return max;
    }
}
