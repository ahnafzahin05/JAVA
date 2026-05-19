package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class TwinPermutations_1831A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) arr[i] = sc.nextInt();
            boolean flag = true;
            while(flag){
                flag = false;
                for(int i=0; i<n-1; i++){
                    if(arr[i]>arr[i+1]){
                        int temp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = temp;
                        flag = true;
                    }
                }
            }

            for(int ele: arr) System.out.print(ele+" ");
            System.out.println();
        }
    }
}
