package Revision;

import java.util.Arrays;

public class prefixAndSuffixSum {
    public static void main(String[] args) {
        int[] arr = {6,4,5,-3,2,8};
        int[] prefixSum = new int[arr.length];
        int[] suffixSum = new int[arr.length];

        prefixSum[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefixSum[i] = arr[i] + prefixSum[i-1];
        }
        System.out.println(Arrays.toString(prefixSum));

        suffixSum[arr.length-1] = arr[arr.length-1];
        for(int j=arr.length-2; j>=0; j--){
            suffixSum[j] = arr[j] + suffixSum[j+1];
        }
        System.out.println(Arrays.toString(suffixSum));
    }
}
