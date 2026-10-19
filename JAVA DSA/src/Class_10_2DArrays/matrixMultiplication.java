package Class_10_2DArrays;

import java.util.Arrays;

public class matrixMultiplication {
    public static void main(String[] args) {
        int[][] a1 = {{1,2,3},{2,1,3},{7,6,5}};
        int[][] a2 = {{2,0},{-1,3},{5,7}};
        int[][] prod = new int[a1.length][a2[0].length];

        for(int i=0; i<prod.length; i++){
            for(int j=0; j<prod[0].length; j++){
                for(int k=0; k<a1.length; k++) prod[i][j]+= a1[i][k]*a2[k][j];
            }
        }

        for(int[] a: prod) System.out.println(Arrays.toString(a));
    }
}
