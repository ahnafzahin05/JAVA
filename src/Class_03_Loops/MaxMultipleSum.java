package Class_03_Loops;

import java.util.Scanner;

public class MaxMultipleSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i<=t; i++){
            int number = sc.nextInt();
            int n, sum=0, maxSum = Integer.MIN_VALUE;
            int x=0;
            for(int j=2; j<=number; j++){
                n = (number-j)/j + 1;

                sum = (int) ((n/2.0)*(2*j+(n-1)*j));
                if(sum>maxSum){
                    maxSum = sum;
                    x = j;
                }
            }
            System.out.println(x);
        }
    }
}
