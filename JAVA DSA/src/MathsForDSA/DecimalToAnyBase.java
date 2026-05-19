package MathsForDSA;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = 123;
        System.out.print("To Base = ");
        int base = sc.nextInt();
        System.out.println("Base "+base+" = "+convertDecimalToBinary(decimal,base));
        System.out.println("Base "+base+" = "+convert(decimal,base));
    }
    public static int convertDecimalToBinary(int decimal, int base){
        int num = 0;
        int power = 0;
        while(decimal>0){
            num = (int) ((decimal%base)*Math.pow(10,power) + num);
            decimal/=base;
            power++;
        }
        return num;
    }
    public static String convert(int decimal, int base){
        String num = "";
        while(decimal>0){
            num = (decimal%base) + num;
            decimal/=base;
        }
        return num;

//        StringBuilder binary = new StringBuilder();
//        while (decimal > 0) {
//            binary.append(decimal % 2);
//            decimal /= 2;
//        }
//        return binary.reverse().toString();
    }
}
