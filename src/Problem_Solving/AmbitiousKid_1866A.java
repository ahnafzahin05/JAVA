package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class AmbitiousKid_1866A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        boolean zero_isPresent = false;
        Arrays.sort(arr);
        for(int i=0; i<n; i++) {
            if(arr[i]==0) {
                zero_isPresent = true;
                break;
            }
        }

        if(zero_isPresent) System.out.println("0");
        else if(n==1) System.out.println(arr[0]<0 ? -arr[0] : arr[0]);
        else{
            Arrays.sort(arr);
            int prefix = arr[0];
            for(int i=0; i<n; i++){
                if(arr[i]<0) prefix = arr[i];
                else break;
            }
            int suffix = arr[n-1];
            for(int i=n-1; i>=0; i--){
                if(arr[i]>0) suffix = arr[i];
                else break;
            }
            System.out.println(Math.min(Math.abs(suffix),Math.abs(prefix)));
        }
    }
}
