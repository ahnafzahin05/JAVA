package Problem_Solving;

import java.util.Scanner;

public class SpyDetected_1512A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) arr[i] = sc.nextInt();

            boolean flag = false;
            for(int i=1; i<n-1; i++){
                if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1]){
                    System.out.println(i+1);
                    flag = true;
                    break;
                }
            }
            if(!flag){
                if(arr[0]!=arr[1]) System.out.println(1);
                else System.out.println(n);
            }
        }
    }
}
