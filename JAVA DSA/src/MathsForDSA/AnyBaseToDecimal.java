package MathsForDSA;

import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 776;
        System.out.print("From Base: ");
        int base = sc.nextInt();
        System.out.println("Decimal = "+convert(number, base));
    }
    //except hexadecimal
    public static int convert(int number, int base){
        int num = 0;
        int power = 0;
        while(number!=0){
            num+= (number%10)*Math.pow(base,power);
            number/=10;
            power++;
        }
        return num;
    }
}
