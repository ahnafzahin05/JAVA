package Class_10_2DArrays;

public class ForEach {
    public static void main(String[] args) {
        int[][] arr = { {2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,1,8,2,6} };
        // Method-1
        for(int i=0; i<arr.length; i++){
            for(int ele : arr[i]){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        System.out.println();
        // Method - 2
        for(int[] a : arr){
            for(int ele : a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
