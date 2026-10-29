package Revision;

public class imageSmoother {
    public static void main(String[] args) {

    }

    public int[][] imageSmooth(int[][] arr){
        int row = arr.length, col = arr[0].length;
        int[][] newArr = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                int lC = Math.max(0,j-1), rC = Math.min(col-1,j+1);
                int uR = Math.max(0,i-1), lR = Math.min(row-1, i+1);
                int sum = 0;

                for(int m=uR; m<=lR; m++){
                    for(int n=lC; n<=rC; n++){
                        sum+=arr[m][n];
                        //total++;
                    }
                }
                int total = (rC-lC+1)*(lR-uR+1);
                newArr[i][j] = sum/total;
            }
        }

        return newArr;
    }
}
