package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class removeSmallest_1399A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int remEle = 0;
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0; j<n; j++) arr[j] = sc.nextInt();
            Arrays.sort(arr);
            for(int j=0; j<n-1; j++) if(Math.abs(arr[j+1]-arr[j])<=1) remEle++;
            if(n-remEle==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
