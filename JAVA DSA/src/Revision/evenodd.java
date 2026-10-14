package Revision;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0) System.out.println((n%2==0)? "Even" : "Odd");
        else System.out.println("Not a Postive Integer");
    }
}
