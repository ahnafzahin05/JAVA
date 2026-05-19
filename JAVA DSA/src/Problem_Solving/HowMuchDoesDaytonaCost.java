package Problem_Solving;

import java.util.Scanner;

public class HowMuchDoesDaytonaCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            boolean k_isPresent = false;
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
                if(arr[i]==k) k_isPresent = true;
            }

            if(!k_isPresent) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
