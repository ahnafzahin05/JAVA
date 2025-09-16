package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class Advantage {
//    public static int maxele(int[] arr, int i){
//        int max = Integer.MIN_VALUE;
//        for(int j=0; j<arr.length; j++){
//            if(arr[j]>max && j!=i){
//                max = arr[j];
//            }
//        }
//        return max;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int test=1; test<=t; test++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i=0; i<n; i++){
                int print=0;
                if(i==n-1) print = arr[i] - arr[i-1];
                else print = arr[i] - arr[n-1] ;
                System.out.print(print+" ");
            }
            System.out.println();
        }
    }
}
