package Revision;

import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = {1,5,8,-3};
        int tarSum = 2;
        int[] tarIdx = new int[2];
        boolean flag = false;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==tarSum){
                    tarIdx[0] = i;
                    tarIdx[1] = j;
                    flag = true;
                    break;
                }
            }
        }

        if(flag) System.out.println(Arrays.toString(tarIdx));
        else System.out.println("DNE");
    }
}
