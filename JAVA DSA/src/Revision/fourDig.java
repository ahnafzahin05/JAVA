package Revision;

import java.util.Scanner;

public class fourDig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n/1000 >=1 && n/1000<10) System.out.println("4 digit num");
        else System.out.println("Not a 4 digit num");
    }
}
