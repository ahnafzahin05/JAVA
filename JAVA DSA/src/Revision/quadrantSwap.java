package Revision;

import java.util.Arrays;

public class quadrantSwap {
    public static void main(String[] args) {
        int[][] arr = { {1,  2,  3,  4,  5,  6},
                        {7,  8,  9,  10, 11, 12},
                        {13, 14, 15, 16, 17, 18},
                        {19, 20, 21, 22, 23, 24},
                        {25, 26, 27, 28, 29, 30},
                        {31, 32, 33, 34, 35, 36}};
        System.out.println(Arrays.deepToString(swapQ1Q4(arr)));
    }
    public static int[][] swapQ1Q4(int[][] arr){
        int n = arr.length, h = n/2;

        for(int i=0; i<h; i++){
            for(int j=0; j<h; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i+h][j+h];
                arr[i+h][j+h] = temp;
            }
        }

        return arr;
    }
}
