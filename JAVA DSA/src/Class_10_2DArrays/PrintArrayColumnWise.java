package Class_10_2DArrays;

public class PrintArrayColumnWise {
    public static void main(String[] args) {
        int[][] arr = { {2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,1,8,2,6} };
        //Transpose Matrix
        for(int i=0; i<arr[0].length; i++){
            for(int j=0; j<arr.length; j++){ //draw the matrix in copy, you can visualize WHY
                System.out.print(arr[j][i]+ " ");
            }
            System.out.println();
        }
    }
}
