package Class_06_Arrays;

public class WavyArray {
    public static void main(String[] args) {
        int[] arr = {1};
        for(int i=0; i<arr.length-1; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
