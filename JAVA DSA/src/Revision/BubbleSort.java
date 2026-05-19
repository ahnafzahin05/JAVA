package Revision;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4};
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            boolean isSorted = true;
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSorted = false;
                }
                print(arr);
            }
            if(isSorted) break;
        }

    }
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
    }
}
