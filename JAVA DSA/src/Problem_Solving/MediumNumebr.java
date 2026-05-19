package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class MediumNumebr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i<=t; i++){
            int[] arr = new int[3];
            for(int j=0; j<3; j++){
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[1]);
        }
    }
}
