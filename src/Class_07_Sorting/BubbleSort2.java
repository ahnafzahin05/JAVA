package Class_07_Sorting;

public class BubbleSort2 {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        //sorted(arr);
        desSort(arr);
        //print(arr);
    }
    public static void sorted(int[] arr) {
        //taking the largest numbers to its correct position
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int swap = 0;
            for(int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]) {
                    swap(arr, j);
                    swap++;
                }
                print(arr);
            }
            if(swap==0) break;
        }
    }
    public static void desSort(int[] arr){
        //taking the smallest numbers to its correct position
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int swap = 0;
            for(int j=n-1; j>i; j--){
                if(arr[j]<arr[j-1]) {
                    desSwap(arr, j);
                    swap++;
                }
                print(arr);
            }
            if(swap==0) break;
        }
    }
    public static void desSwap(int[] arr, int j){
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
    }
    public static void swap(int[] arr, int j){
        int temp = arr[j];
        arr[j] = arr[j +1];
        arr[j +1] = temp;
    }
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
