package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class EqualCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i<=t; i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0; j<n; j++){
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            int eat=0;
            for(int j=arr.length-1; j>=0; j--){
                if(arr[j]>arr[0]) eat = eat + (arr[j]-arr[0]);
            }
            System.out.println(eat);
        }
    }
}
