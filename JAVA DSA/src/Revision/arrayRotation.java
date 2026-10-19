package Revision;

import java.util.Arrays;

public class arrayRotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        int k = 2;
        k = k%6;

        int i=0, j=n-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        i=0; j=k-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        i=k; j=n-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
//        for(int t=1; t<=k; t++){
//            int temp = arr[n-1];
//            for(int i=n-1; i>0; i--){
//                arr[i] = arr[i-1];
//            }
//            arr[0] = temp;
//        }


        System.out.println(Arrays.toString(arr));
    }


}
