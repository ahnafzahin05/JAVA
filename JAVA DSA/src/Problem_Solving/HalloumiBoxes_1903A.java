package Problem_Solving;

import java.util.Scanner;

public class HalloumiBoxes_1903A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=1; t<=test; t++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            if(k==1){
                if(isSorted(arr)) System.out.println("YES");
                else System.out.println("NO");
            }
            else System.out.println("YES");
        }
    }

    private static boolean isSorted(int[] arr){
        boolean flag = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
