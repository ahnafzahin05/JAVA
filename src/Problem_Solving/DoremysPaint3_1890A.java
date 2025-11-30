package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class DoremysPaint3_1890A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) arr[i] = sc.nextInt();

            int d = 1;
            for(int i=0; i<n-1; i++){
                if(arr[i]!=arr[i+1]) d++;
            }

            int[] freq = new int[n];
        }
    }
}
