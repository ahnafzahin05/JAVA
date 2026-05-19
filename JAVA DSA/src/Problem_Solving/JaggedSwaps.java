package Problem_Solving;

import java.util.Scanner;

public class JaggedSwaps {
    public static boolean isSorted(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int test=1; test<=t; test++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            for(int i=1; ; i++){
                if(i>=n-1) i=1;
                if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
                else break;
            }
            if(isSorted(arr)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
