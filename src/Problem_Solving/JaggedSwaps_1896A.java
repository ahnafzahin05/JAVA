package Problem_Solving;

import java.util.Scanner;

public class JaggedSwaps_1896A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            boolean flag = true;
            boolean isSorted = true;
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
                if(arr[i]>n) {
                    flag = false;
                    break;
                }
            }
            for(int i=1; i<n; i++){
                if(arr[i]<arr[i-1]) {
                    isSorted=false;
                    break;
                }
            }

            if(!flag) System.out.println("NO");
            else if(isSorted) System.out.println("YES");
            else{
                flag = false;
                for(int i=1; i<n-1; i++){
                    if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
                        flag = true;
                        break;
                    }
                }
                if(flag && arr[0]==1) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
