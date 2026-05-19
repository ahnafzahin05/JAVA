package Problem_Solving;

import java.util.Scanner;

public class SerejaAndDima_381A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int S = 0, D = 0;
        int flag = 1;
        int i=0, j=n-1;
        while(i<=j){
            if(flag==1) {
                if(arr[i]>arr[j]){
                    S+=arr[i];
                    i++;
                }
                else{
                    S+=arr[j];
                    j--;
                }
                flag = 0;
            }
            else{
                if(arr[i]>arr[j]){
                    D+=arr[i];
                    i++;
                }
                else{
                    D+=arr[j];
                    j--;
                }
                flag = 1;
            }
        }
        System.out.println(S+" "+D);
    }
}
