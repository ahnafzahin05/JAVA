package MathsForDSA;

public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 123;
        System.out.println("Binary = "+convertDecimalToBinary(decimal));
        System.out.println("Binary = "+convert(decimal));
    }
    public static int convertDecimalToBinary(int decimal){
        int num = 0;
        int power = 0;
        while(decimal>0){
            num = (int) ((decimal%2)*Math.pow(10,power) + num);
            decimal/=2;
            power++;
        }
        return num;
    }
    public static String convert(int decimal){
        String num = "";
        while(decimal>0){
            num = (decimal%2) + num;
            decimal/=2;
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
