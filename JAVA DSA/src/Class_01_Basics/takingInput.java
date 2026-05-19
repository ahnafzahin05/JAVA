package Class_01_Basics;

import java.util.Scanner;

public class takingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double n = sc.nextDouble();
        double r = sc.nextDouble();
        double i = (p*n*r)/100;
        System.out.println(i);
    }
}
