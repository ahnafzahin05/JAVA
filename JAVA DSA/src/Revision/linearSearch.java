package Revision;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {-5,6,0,3,-6,3,2,10};
        int tar = 11, k = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==tar){
                k = i;
                break;
            }
        }
        if(k==-1) System.out.println("DNE");
        else System.out.println(arr[k]);
    }
}
