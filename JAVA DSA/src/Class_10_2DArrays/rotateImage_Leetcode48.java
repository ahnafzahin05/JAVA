package Class_10_2DArrays;

import java.util.Arrays;

public class rotateImage_Leetcode48 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        //Transpose
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //Reverse Each Row
        for(int i=0; i<arr.length; i++){
            int l=0, r=arr[0].length-1;
            while(l<r){
                int temp = arr[i][l];
                arr[i][l] = arr[i][r];
                arr[i][r] = temp;
                l++;
                r--;
            }
        }
        for(int[] a: arr) System.out.println(Arrays.toString(a));
    }
}
