package Class_10_2DArrays;

import java.util.Arrays;

public class MinEleAmongMaxEleOfEachRow {
    public static void main(String[] args) {
        int[][] arr = {{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,1,8,2,6}};
        int[] maxEle = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            int max = Integer.MIN_VALUE;
            for(int j=0; j<arr[0].length; j++){
                max = Integer.max(max, arr[i][j]);
            }
            maxEle[i] = max;
        }
        Arrays.sort(maxEle);
        System.out.println(maxEle[0]);
    }

}
