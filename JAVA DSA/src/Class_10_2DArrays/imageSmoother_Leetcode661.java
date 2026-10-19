package Class_10_2DArrays;

import java.util.Arrays;

public class imageSmoother_Leetcode661 {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] newArr = new int[arr.length][arr[0].length];

        int row = arr.length-1, col = arr[0].length-1;
        int stRow = 0, stCol = 0, endRow = 0, endCol = 0;

        for(int i=0; i<=row; i++){
            for(int j=0; j<=col; j++){

                int sum = 0, count = 0;
                stRow = Math.max(0,i-1); stCol = Math.max(0,j-1);
                endRow = Math.min(row,i+1); endCol = Math.min(col,j+1);

                for(int m=stRow; m<=endRow; m++){
                    for(int n=stCol; n<=endCol; n++){
                        sum+=arr[m][n];
                        count++;
                    }
                }
                newArr[i][j] = sum/count;
            }
        }

        for(int[] ele: newArr) System.out.println(Arrays.toString(ele));
    }
}
