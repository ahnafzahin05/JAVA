package Class_10_2DArrays;

import java.util.Arrays;

public class sumOfEveryColumn {
    public static void main(String[] args) {
        int[][] arr = {{4,3,8},{2,5,1},{7,-1,9},{5,4,-2}};
        int[][] ans = getColWiseSum(arr);
        for(int[] ele:ans) System.out.println(Arrays.toString(ele));
    }

    public static int[][] getColWiseSum(int[][] arr){
        int[][] sumResult = new int[1][arr[0].length];

        for(int i=0; i<arr[0].length; i++){ //col
            int sum = 0;
            for(int j=0; j<arr.length; j++){ //row
                sum+=arr[j][i];
            }
            sumResult[0][i] = sum;
        }

        return sumResult;
    }
}
