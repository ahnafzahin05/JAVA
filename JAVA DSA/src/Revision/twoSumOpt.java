package Revision;

import java.util.Arrays;

public class twoSumOpt {
    public static void main(String[] args) {
        int[] arr = {4,-3,0,5,10,-1};
        int target = 9;
        Arrays.sort(arr);
        //-3,0,4,5,6,10
        boolean flag = false;
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]>target) j--;
            else if(arr[i]+arr[j]<target) i++;
            else if(arr[i]+arr[j]==target){
                flag = true;
                break;
            }
        }
        if(flag) System.out.println(arr[i]+" "+arr[j]);
        else System.out.println("DNE");
    }
}
