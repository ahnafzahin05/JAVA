package Class_06_Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,-47,0,-1,8};
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max) max = arr[i];
        }
        System.out.println(max);
    }
}
