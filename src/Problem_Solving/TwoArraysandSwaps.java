package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArraysandSwaps {
    public static void ReverseSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            boolean isSorted = true;
            for(int j=0; j<n-1-i; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSorted = false;
                }
            }
            if(isSorted) break; //if already sorted, then break the loop
            //print(arr);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i<=t; i++){
            int n = sc.nextInt(); //no. of ele in array a and b
            int k = sc.nextInt(); //max number of swaps

            int[] a = new int[n];
            int[] b = new int[n];

            for(int j=0; j<n; j++){
                a[j] = sc.nextInt();
            }
            for(int j=0; j<n; j++){
                b[j] = sc.nextInt();
            }

            Arrays.sort(a);
            ReverseSort(b);

            int swap = 0;
            for(int m=0; swap<k && m<n; m++){
                if(a[m]<b[m]){
                    a[m] = b[m];
                }
                swap++;
            }

            int sum = 0;
            for(int p=0; p<n; p++){
                sum+=a[p];
            }
            System.out.println(sum);
        }
    }
}
