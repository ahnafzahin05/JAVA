package Class_10_2DArrays;

import java.util.Arrays;

public class diagonalTraverse_LeetCode498 {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        findDiagonalOrder(mat);
    }
    public static void findDiagonalOrder(int[][] mat){
        int m = mat.length, n = mat[0].length;

        for (int s = 0; s <= m + n - 2; s++) {
            int row = Math.max(0, s - (n - 1));
            int col = s - row;

            while (row < m && col >= 0) {
                System.out.print(mat[row][col] + " ");
                row++;
                col--;
            }
            System.out.println();
        }
    }
}
