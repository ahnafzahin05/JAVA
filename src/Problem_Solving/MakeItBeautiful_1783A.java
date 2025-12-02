package Problem_Solving;

import java.util.Scanner;

public class MakeItBeautiful_1783A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) arr[i] = sc.nextInt();
            boolean distinct = false;
            for(int i=0; i<n-1; i++){
                if(arr[i]!=arr[i+1]){
                    distinct = true;
                    break;
                }
            }

            if(!distinct) System.out.println("NO");
            else if(n == 2){
                System.out.println("YES");
                for(int ele: arr) System.out.print(ele+" ");
                System.out.println();
            }
            else{

            }
        }
    }
}
