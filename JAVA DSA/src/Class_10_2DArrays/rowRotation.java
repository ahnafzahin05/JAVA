package Class_10_2DArrays;

import java.util.Arrays;

public class rowRotation {
    public static void main(String[] args) {
        int[][] arr = {{0,1,2,3,4},{5,6,7,8,9},{10,11,12,13,14},{15,16,17,18,19},{20,21,22,23,24}};
        int row = arr.length;
        int k = 3;
        k = k%row;

        int i=0, j=row-1;
        while(i<j){
            int[] temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        i=0; j=k-1;
        while(i<j){
            int[] temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        i=k; j=row-1;
        while(i<j){
            int[] temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for(int[] ele: arr) System.out.println(Arrays.toString(ele));
    }
}
