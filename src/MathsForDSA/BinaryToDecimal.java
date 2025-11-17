package MathsForDSA;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int binary = 110100111;
        System.out.println(convert(binary));
    }
    public static int convert(int binary){
        int num = 0;
        int power = 0;
        while(binary!=0){
            num+= (binary%10)*Math.pow(2,power);
            binary/=10;
            power++;
        }
        return num;
    }
}
