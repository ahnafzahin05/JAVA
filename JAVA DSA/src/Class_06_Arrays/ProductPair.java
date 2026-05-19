package Class_06_Arrays;

import java.util.Arrays;

public class ProductPair {
    public static void main(String[] args) {
        int[] arr = {10,20,9,40};
        long target = 400;
        System.out.println(isProduct(arr, target));
    }

    private static boolean isProduct(int[] arr, long target) {
        Arrays.sort(arr);
        int start = 0, end = arr.length-1;
        while(start<end){
            long prod = (long) arr[start] *arr[end];
            if(prod == target) return true;
            else if(prod>target) end--;
            else start++;
        }
        return false;
    }

}
