package Class_10_2DArrays;

public class gameOfLife_LeetCode289 {
    public static void main(String[] args) {

    }
    public void gameOfLife(int[][] board){
        int row = board.length, col = board[0].length;
        int[][] newArr = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                int sum = 0;
                int fR = Math.max(0,i-1), lR = Math.min(row-1,i+1);
                int fC = Math.max(0,j-1), lC = Math.min(col-1,j+1);

                for(int m=fR; m<=lR; m++){
                    for(int n=fC; n<=lC; n++){
                        if(m!=i || n!= j) sum+=board[m][n];
//                        if(m==i && n== j) continue;
//                        else sum+=board[m][n];
                    }
                }

                if(board[i][j]==1){
                    if(sum<2) newArr[i][j] = 0;
                    else if(sum==2 || sum==3) newArr[i][j] = 1;
                    else newArr[i][j] = 0;
                }
                else{
                    if(sum==3) newArr[i][j] = 1;
                    else newArr[i][j] = 0;
                }
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                board[i][j] = newArr[i][j];
            }
        }
    }
}
