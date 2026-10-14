package Revision;

public class largestSumContSubArray {
    public static void main(String[] args) {
        int[] arr = {4,-6,2,8};
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int pS = 0;
            for(int j=i; j<n; j++){
                pS+=arr[j];
                max = Math.max(max,pS);
            }
        }
        System.out.println(max);
    }
}
