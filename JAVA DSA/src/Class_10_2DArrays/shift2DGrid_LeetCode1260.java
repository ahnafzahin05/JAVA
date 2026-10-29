package Class_10_2DArrays;

import java.util.Arrays;

public class shift2DGrid_LeetCode1260 {
    public static void main(String[] args) {
        int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
        int k = 9;
        shiftGrid(grid,k);
        for(int[] a:grid) System.out.println(Arrays.toString(a));

    }
    public static void shiftGrid(int[][] grid, int k){
        int row = grid.length, col = grid[0].length;
        int[] arr = new int[row*col];

        int idx = 0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++) arr[idx++] = grid[i][j];
        }

        k%=arr.length;

        int l=0, r=arr.length-1;
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

        l=0; r=k-1;
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

        l=k; r=arr.length-1;
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

        idx = 0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++) grid[i][j] = arr[idx++];
        }

        //return grid;
    }
}
