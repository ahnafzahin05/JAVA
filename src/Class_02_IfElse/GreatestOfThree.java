package Class_02_IfElse;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//        //method 1
//        if(a>b && a>c) System.out.println(a);
//        else if(b>a && b>c) System.out.println(b);
//        else System.out.println(c);
        //method 2
        if(a>b){
            if(a>c) System.out.println(a);
            else System.out.println(c);
        }
        else{
            if(b>c) System.out.println(b);
            else System.out.println(c);
        }
        //method 3 (using nested ternary)
//        System.out.println( (a>b) ? ((a>c) ? a : c) : ((b>c) ? b : c));
    }
}
