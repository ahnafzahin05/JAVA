package Revision;

import java.util.Arrays;

public class waveArray {
    public static void main(String[] args) {
        int[] arr = {2,4,7,8,9,10};
        int i = 0, j = i+1;
        while(j<arr.length){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i+=2;
            j+=2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
