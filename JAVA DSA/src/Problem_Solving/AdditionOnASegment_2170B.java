package Problem_Solving;

import java.util.Scanner;

public class AdditionOnASegment_2170B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int zero = 0, one = 0, max = -1;
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
                if(arr[i]==0) zero++;
                if(arr[i]==1) one++;
                if(arr[i]>max) max = arr[i];
            }
            if(one==n) System.out.println("1");
            else if(zero>0) System.out.println(max - zero);
            else System.out.println(n);

        }
    }
}
