package Class_10_2DArrays;

import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        int[][] arr = { {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        rotate90CW(arr);
        rotate90ACW(arr);
        print(arr);
    }

    public static void rotate90CW(int[][] arr){
        transpose(arr);
        reverseRow(arr);
    }

    public static void rotate90ACW(int[][] arr){
        reverseRow(arr);
        transpose(arr);
    }

    public static void rotate180(int[][] arr){
        reverseRow(arr);
        reverseCol(arr);
    }

    public static void transpose(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void reverseRow(int[][] arr){
        for(int i=0; i<arr.length; i++){
            int l = 0, r = arr.length-1;
            while(l<r){
                int temp = arr[i][l];
                arr[i][l] = arr[i][r];
                arr[i][r] = temp;
                l++;
                r--;
            }
        }
    }

    public static void reverseCol(int[][] arr){
        for(int i=0; i<arr.length; i++){
            int up = 0, down = arr.length-1;
            while(up<down){
                int temp = arr[up][i];
                arr[up][i] = arr[down][i];
                arr[down][i] = temp;
                up++;
                down--;
            }
        }
    }

    public static void print(int[][] arr){
        for(int[] a: arr) System.out.println(Arrays.toString(a));
    }
}
