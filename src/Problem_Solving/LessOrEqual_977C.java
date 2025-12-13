package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class LessOrEqual_977C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);

        if(k<n && k>0 && arr[k-1]<arr[k]) System.out.println(arr[k-1]);
        else if(k==n) System.out.println(arr[k-1]);
        else System.out.println("-1");
    }
}
