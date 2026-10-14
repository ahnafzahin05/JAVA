package Revision;

import java.util.Scanner;

public class printGP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //1,2,4,8
        int a=1, r=2;
        for(int i=0; i<n; i++){
            System.out.println(a);
            a*=2;
        }
    }
}
