package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class Twins {
    public static void DecreasingSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            boolean isSorted = true;
            for(int j=0; j<n-1-i; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSorted = false;
                }
            }
            if(isSorted) break; //if already sorted, then break the loop
            //print(arr);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        DecreasingSort(arr);
        int tsum=0;
        for(int i=0; i<n; i++){
            tsum+=arr[i];
        }
        int sum=0;
        int coins=0;
        double border = tsum/2.0;
        for(int i=0; i<n; i++){
            if(sum>border) break;
            else{
                sum+=arr[i];
                coins++;
            }
        }
        System.out.println(coins);
    }
}
