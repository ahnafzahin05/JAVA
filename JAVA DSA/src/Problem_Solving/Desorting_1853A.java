package Problem_Solving;

import java.util.Scanner;

public class Desorting_1853A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) arr[i] = sc.nextInt();
            boolean isSorted = true;
            for(int i=0; i<n-1; i++){
                if(arr[i]>arr[i+1]){
                    isSorted = false;
                    break;
                }
            }

            if(!isSorted) System.out.println("0");
            else{
                int minDiff = Integer.MAX_VALUE;
                for(int i=0; i<n-1; i++) {
                    int diff = arr[i + 1] - arr[i];
                    if(diff < minDiff) minDiff = diff;
                }
                System.out.println(minDiff/2 +1);
            }
        }
    }
}
