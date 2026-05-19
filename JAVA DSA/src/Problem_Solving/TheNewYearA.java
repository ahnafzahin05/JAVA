package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class TheNewYearA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i=0; i<3; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int totald = (arr[1]-arr[0]) + (arr[2]-arr[1]);
        System.out.println(totald);

    }
}
