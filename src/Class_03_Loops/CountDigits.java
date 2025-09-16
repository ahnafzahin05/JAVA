package Class_03_Loops;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        if(n==0) n=1;
        int count = 0;
        while(n!=0){
            n = n/10;
            count++;
        }
        System.out.println(count);
    }
}
