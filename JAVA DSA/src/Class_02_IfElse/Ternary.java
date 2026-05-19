package Class_02_IfElse;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        if(n%2==0) System.out.println("Even");
//        else System.out.println("Odd");
        //Ternary--> condition ? true statement : false statement
        System.out.println(((n%2==0) ? "Even" : "Odd"));
        //System.out.println(n +" is "+ ((n%2==0) ? "Even" : "Odd"));
    }
}
