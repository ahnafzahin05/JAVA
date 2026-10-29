package Revision;

import java.util.Arrays;

public class Fall25_MidQ1 {
    public static void main(String[] args) {
        int[][] grid = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        String[][] directions = {{"SE","SE","SW","NE"},{"SW","SW","NE","SE"},{"NW","SW","NE","NW"},{"SE","NW","SW","NE"}};
        System.out.println(Arrays.deepToString(blockEnergySum(grid, directions)));
    }
    public static int[][] blockEnergySum(int[][] grid, String[][] directions){
        int row = grid.length, col = grid[0].length;
        int[][] res = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                int sum = grid[i][j];

                if(directions[i][j].equals("SE")){
                    int m=i+1, n=j+1;
                    while(m<row && n<col){
                        sum+=grid[m][n];
                        m++;
                        n++;
                    }
                }
                else if(directions[i][j].equals("SW")){
                    int m=i+1, n=j-1;
                    while(m<row && n>=0){
                        sum+=grid[m][n];
                        m++;
                        n--;
                    }
                }
                else if(directions[i][j].equals("NW")){
                    int m=i-1, n=j-1;
                    while(m>=0 && n>=0){
                        sum+=grid[n][n];
                        m--;
                        n--;
                    }
                }
                else if(directions[i][j].equals("NE")){
                    int m=i-1, n=j+1;
                    while(m>=0 && n<col){
                        sum+=grid[m][n];
                        m--;
                        n++;
                    }
                }

                res[i][j] = sum;
            }
        }

        return res;
    }
}
