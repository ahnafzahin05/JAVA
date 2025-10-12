package Class_10_2DArrays;

public class Initialization {
    public static void main(String[] args) {
        // Initialization method - 1
//        int[][] arr = new int[3][2];
//        for(int i=0; i<arr.length; i++){ //arr.length --> we get no. of rows
//            for(int j=0; j<arr[0].length; j++){ // arr[0].length --> we get no. of coloumns
//                System.out.print(arr[i][j]+ " ");
//            }
//            System.out.println();
//        }
        // Initialization method - 2
        int[][] arr = {{6,0,2}, {1,3,5}, {7,4,0}};
        for(int i=0; i<arr.length; i++){ //arr.length --> we get no. of rows
            for(int j=0; j<arr[0].length; j++){ // arr[0].length --> we get no. of coloumns
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
