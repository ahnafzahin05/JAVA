package Class_10_2DArrays;

public class zigzagWalk_LAB1T1 {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 8, 4, 6, 1},
                {7, 2, 1, 9, 3},
                {9, 0, 7, 5, 8},
                {2, 1, 3, 4, 0}
        };

        zigzagWalk(arr);
    }

    public static void zigzagWalk(int[][] arr){
        int row = arr.length, col = arr[0].length;

        for(int i=0; i<col; i++){
            if(i%2==0){
                for(int j=0; j<row; j+=2){
                    System.out.print(arr[j][i]+" ");
                }
                System.out.println();
            }
            else{
                if(row%2==0){
                    for(int j=row-1; j>=0; j-=2){
                        System.out.print(arr[j][i]+" ");
                    }
                    System.out.println();
                }
                else{
                    for(int j=row-2; j>=0; j-=2){
                        System.out.print(arr[j][i]+" ");
                    }
                    System.out.println();
                }

            }
        }
    }
}
