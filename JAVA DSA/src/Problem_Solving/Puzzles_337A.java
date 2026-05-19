package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class Puzzles_337A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        for(int i=0; i<m; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int i=0, j=n-1;
        while(j<m){
            min = Math.min(min, arr[j]-arr[i]);
            i++; j++;
        }
        System.out.println(min);
    }
}
