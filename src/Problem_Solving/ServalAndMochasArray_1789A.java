package Problem_Solving;

import java.util.Scanner;

public class ServalAndMochasArray_1789A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t-->0){
//
//        }
        System.out.println(gcd(35,21));
    }
    public static int gcd(int a, int b){
        while(b!=0){
          int rem = a%b;
          a = b;
          b = rem;
        }
        return a;
    }
}
