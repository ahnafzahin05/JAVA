package Revision;

import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        int[] arr = {6, 8, 1, 2, 4, 9, 0};
        int r = 2, n = arr.length;
        r = r%n;

        for(int t=0; t<r; t++){
            int temp = arr[0];
            for(int i=0; i<arr.length-1; i++) arr[i] = arr[i+1];
            arr[arr.length-1] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
