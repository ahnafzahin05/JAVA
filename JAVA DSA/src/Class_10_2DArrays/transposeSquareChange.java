package Class_10_2DArrays;

import java.util.Arrays;

public class transposeSquareChange {
    public static void main(String[] args) {
        int[][] arr = {{2,8,3,4},{7,2,1,6},{5,5,4,1},{3,1,8,2}};
        //change the array, not print
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int[] a: arr) System.out.println(Arrays.toString(a));
    }
}
