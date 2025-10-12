package Class_10_2DArrays;

public class ReverseRowsAndCols {
    public static void main(String[] args) {
        int[][] arr = { {2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,1,8,2,6} };
        for(int i=0; i<arr.length; i++){
            reverse(arr[i]);
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //now reverse the column
    }

    private static void reverse(int[] arr) {
        int i=0, j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
    }
}
