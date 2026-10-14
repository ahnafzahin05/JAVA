package Revision;

import java.util.Scanner;

public class intOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        if(n==Math.floor(n)) System.out.println("Integer");
        else System.out.println("Not an Integer");
    }
}
