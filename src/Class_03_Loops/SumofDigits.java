package Class_03_Loops;

public class SumofDigits {
    public static void main(String[] args) {
        int n = -5640;
        int sum = 0;
        while(n!=0){
            sum = sum + n%10;
            n = n/10;
        }
        System.out.println(Math.abs(sum));
    }
}
