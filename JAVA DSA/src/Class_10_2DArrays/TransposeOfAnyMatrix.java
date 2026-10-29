package Class_10_2DArrays;

import java.util.Arrays;

public class TransposeOfAnyMatrix {
    public static void main(String[] args) {
        int[][] arr = { {1,2,3},
                        {4,5,6}};
        int row = arr.length, col = arr[0].length;
        int[][] t = new int[col][row];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                t[j][i] = arr[i][j];
            }
        }

        for(int[] a: t) System.out.println(Arrays.toString(a));
    }
}
