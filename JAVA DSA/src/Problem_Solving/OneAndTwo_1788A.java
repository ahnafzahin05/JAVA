package Problem_Solving;

import java.util.Scanner;

public class OneAndTwo_1788A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) arr[i] = sc.nextInt();
            boolean two_isPresent = false;
            int twoCount = 0;
            for(int i=0; i<n; i++){
                if(arr[i]==2){
                    two_isPresent = true;
                    twoCount++;
                }
            }
            if(!two_isPresent) System.out.println("1");
            else{
                if(twoCount%2==1) System.out.println("-1");
                else {
                    int temp = 0, ans = 0;
                    for(int i=0; i<n; i++){
                        if(arr[i]==2){
                            temp++;
                            if(temp==twoCount/2) {
                                ans = i+1;
                                break;
                            }
                        }
                    }
                    System.out.println(ans);
                }
            }
        }
    }
}
