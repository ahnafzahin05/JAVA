package Revision;

public class maxDiffBetw2Elements {
    public static void main(String[] args) {
        int[] arr = {9,5,8,12,2,3,7,4};
        int n = arr.length;

        int[] suffixMax = new int[n];
        int maxDiff = Integer.MIN_VALUE;

        suffixMax[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--) suffixMax[i] = Math.max(suffixMax[i+1],arr[i]);

        for(int i=0; i<n-1; i++) maxDiff = Math.max(maxDiff,suffixMax[i+1]-arr[i]);
        System.out.println(maxDiff);

    }
}
