package Class_02_IfElse;

import java.util.Scanner;

public class NestedTernary {
    public static void main(String[] args) {
        //greatest of three
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        //wrong ternary implementation --> sout er moddhe ternary thakbe, ternary er moddhe sout na
        //(a>b) ? ((a>c) ? System.out.println(a) : System.out.println(c)) : ((b>c) ? System.out.println(b) : System.out.println(c))

        System.out.println( (a>b) ? ((a>c) ? a : c) : ((b>c) ? b : c) );
    }
}
