package Class_02_IfElse;

import java.util.Scanner;

public class IntegerOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        if(x == (int)x) System.out.println("Integer");
        else System.out.println("Not an Integer");
//        int y = (int)x;
//        double diff = x - y;
//        if(diff!=0) System.out.println("Not an Inger");
//        else System.out.println("Integer");
    }
}
