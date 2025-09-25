package Class_06_Arrays;

public class PrefixAndSuffixSum {
    public static void main(String[] args) {
        int[] arr = {2,3,-8,7,-1,2,3};

        int[] preSum = new int[arr.length];
        preSum[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            preSum[i] = preSum[i-1] + arr[i];
        }

        int[] sufSum = new int[arr.length];
        sufSum[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--){
            sufSum[i] = sufSum[i+1] + arr[i];
        }

        print(preSum);
        print(sufSum);
    }
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
