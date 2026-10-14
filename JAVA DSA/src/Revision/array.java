package Revision;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int[] arr = {-3,2,0,-5,10};
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max) max = arr[i];
        }
        System.out.println(max);
    }
}
