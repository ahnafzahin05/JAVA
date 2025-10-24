package Revision;

public class MoveAllZerosToEnd_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,0,0,0,0};
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]==0){
                    arr[j] = arr[j+1];
                    arr[j+1] = 0;
                }
                print(arr);
            }

        }
    }
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
    }
}
