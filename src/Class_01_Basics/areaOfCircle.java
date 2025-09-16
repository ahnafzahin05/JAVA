package Class_01_Basics;

import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //introducing my scanner name "sc" (given by me)
        double r = sc.nextDouble(); //nextVARTYPE()
        double area = 3.141592*r*r;
        System.out.println(area);
    }
}
