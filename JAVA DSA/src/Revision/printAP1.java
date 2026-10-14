package Revision;

import java.util.Scanner;

public class printAP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2; i<=2+(n-1)*3; i+=3) System.out.println(i);
    }
}
