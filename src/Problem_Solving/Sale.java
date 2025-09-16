package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class Sale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //total number of TV's
        int m = sc.nextInt(); //number of TV bob can take
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int sum=0;
        for(int i=0; i<m; i++){
            if(arr[i]<0) sum+=arr[i];
            else break;
        }
        System.out.println(sum*-1);

    }
}
