package Class_03_Loops;

public class ReConstructDigit {
    public static void main(String[] args) {
        int n = 5432010;
        int divisor = 1;
        int temp = n;
        while(temp>=10){
            divisor*=10;
            temp/=10;
        }
        //System.out.println(divisor);
        int num = 0;
        while(divisor>=1){
            int leftMostDigit = n/divisor;
            num = num*10 + leftMostDigit;
            n = n%divisor;
            divisor/=10;
        }
        System.out.println(num);
    }
}
