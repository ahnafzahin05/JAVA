package Revision;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,4};
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int min = Integer.MAX_VALUE;
            int minIdx = 0;
            for(int j=i; j<n; j++){
                if(arr[j]<min){
                    min = arr[j];
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
            print(arr);
        }
    }
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
    }
}
