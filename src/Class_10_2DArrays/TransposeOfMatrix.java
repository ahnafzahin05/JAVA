package Class_10_2DArrays;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] arr = { {2,8,3,4},{7,2,1,6},{5,5,4,1},{3,1,8,2} };
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr[0].length; j++){
                //System.out.print(arr[i][j]+" "+arr[j][i]);
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
            //System.out.println();
        }
        print(arr);
    }
    public static void print(int[][] arr){
        for(int[] a : arr){
            for(int ele : a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
