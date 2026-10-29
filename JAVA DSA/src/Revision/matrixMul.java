package Revision;

import java.util.Arrays;

public class matrixMul {
    public static void main(String[] args) {
        //perform a1 x a2
        //any matrix is of mxn dimension
        int[][] a1 = {{1,2,3},{2,1,3},{7,6,5}};
        int[][] a2 = {{2,0},{-1,3},{5,7}};

        int m1 = a1.length;
        int n1 = a1[0].length;

        int m2 = a2.length;
        int n2 = a2[0].length;

        int row = m1, col = n2;
        int[][] prod = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                for(int l=0; l<m2; l++){
                    prod[i][j]+= a1[i][l] * a2[l][j];
                }
            }
        }

        for(int[] a: prod) System.out.println(Arrays.toString(a));
    }
}
