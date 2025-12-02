package Problem_Solving;

import java.util.Scanner;

public class BlankSpace_1829B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int maxCount = 0, temp = 0;
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
                if(arr[i]==0) temp++;
                else{
                    maxCount = Integer.max(maxCount,temp);
                    temp = 0;
                }
            }
            maxCount = Integer.max(maxCount,temp);
            System.out.println(maxCount);
        }
    }
}
