package Class_10_2DArrays;

public class output2D {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];

        System.out.println(arr.length); //no of rows
        System.out.println(arr[0].length); //no of columns

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
