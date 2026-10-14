package Revision;

import java.util.Scanner;

public class gettingDigitsFromLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int div = 1;
        while(div*10<=n) div*=10; //while(div<=n) div*=10; is wrong because suppose n=123 and div=100 rn, the div should stop
        //here but according to the cond it is still less than n, so it will run one more time and become greater than n
        //and then stop, so everytime in the next while loop i'll get the first number as 0.

        while(div>=1){
            int digit = n/div;
            System.out.println(digit);
            n%=div;
            div/=10;
        }
    }
}
