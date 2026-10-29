package Class_10_2DArrays;

import java.util.Arrays;

public class decryptionProcess_LAB1T2 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 1},
                {6, 4, 2},
                {5, 1, 7},
                {9, 3, 3},
                {8, 5, 4}
        };

        System.out.println(Arrays.toString(decrypt(arr)));
    }

    public static int[] decrypt(int[][] arr){
        int row = arr.length, col = arr[0].length;
        int[] newArr = new int[col-1];
        int idx = 0;

        for(int i=0; i<col-1; i++){
            for(int j=0; j<row; j++){
                newArr[idx]+= arr[j][i+1] - arr[j][i];
            }
            idx++;
        }

        return newArr;
    }
}
