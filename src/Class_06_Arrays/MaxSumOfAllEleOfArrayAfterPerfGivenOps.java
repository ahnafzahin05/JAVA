package Class_06_Arrays;

public class MaxSumOfAllEleOfArrayAfterPerfGivenOps {
    public static void main(String[] args) {
        int[] arr = {-9,-8,-7};
        System.out.println(maxSum(arr));
    }

    private static int maxSum(int[] arr) {
        int maxSum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0) arr[i]*=-1;
            else break;
        }
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]<0) arr[i]*=-1;
            else break;
        }
        for(int i=0; i<arr.length; i++){
            maxSum+=arr[i];
        }
        return maxSum;
    }
}
