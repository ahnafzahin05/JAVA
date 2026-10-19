package Class_10_2DArrays;

public class spiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        int firstCol = 0, firstRow = 0, lastCol = arr[0].length-1, lastRow = arr.length-1;

        while(firstRow<=lastRow && firstCol<=lastCol){
            for(int i=firstCol; i<=lastCol; i++) System.out.print(arr[firstRow][i]+" "); //r fixed, col changes
            firstRow++;
            if(firstRow>lastRow) break;

            for(int i=firstRow; i<=lastRow; i++) System.out.print(arr[i][lastCol]+" "); //r changes, c fixed
            lastCol--;
            if(firstCol>lastCol) break;

            for(int i=lastCol; i>=firstCol; i--) System.out.print(arr[lastRow][i]+" "); //r fixed, col changes
            lastRow--;
            if(firstRow>lastRow) break;

            for(int i=lastRow; i>=firstRow; i--) System.out.print(arr[i][firstCol]+" "); //r changes, c fixed
            firstCol++;
        }

    }
}
