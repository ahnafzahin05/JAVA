package Revision;

import java.util.Arrays;

public class rotateArrayUsingReverseMethod {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int r = 3;
        reverse(arr,0,r-1);
        reverse(arr,r,arr.length-1);
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    static void reverse(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
