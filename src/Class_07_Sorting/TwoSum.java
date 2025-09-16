package Class_07_Sorting;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {7,0,4,3,2,8,10};
        int n = arr.length;
        int target = 7;

        Arrays.sort(arr);
        int start = 0, end = n-1;
        while(start<end){
            if(arr[start]+arr[end]>target){
                end--;
            }else if(arr[start]+arr[end]<target){
                start++;
            }else if(arr[start]+arr[end]==target){
                System.out.println(arr[start]);
                System.out.println(arr[end]);
                break;
            }
        }
    }
}
