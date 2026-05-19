package Class_06_Arrays;

import java.util.Scanner;

public class r {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,6};
        int k = 3;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==k && arr[j]!=arr[j-1]) count++;
            }
        }
        System.out.println("No. of distinct pair = " +count);
    }

}
