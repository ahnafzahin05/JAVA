package Class_07_Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {8,4,1,9,-3,-1,0,10,12,-3,6,5};

        for(int startIdx=0; startIdx<arr.length; startIdx++){
            int min = Integer.MAX_VALUE;
            int minIdx=0;
            for(int i=startIdx; i<arr.length; i++){
                if(arr[i]<min) {
                    min = arr[i];
                    minIdx = i;
                }
            }
            int temp = arr[startIdx];
            arr[startIdx] = min;
            arr[minIdx] = temp;
        }

        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
