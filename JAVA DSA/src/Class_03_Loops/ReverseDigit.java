package Class_03_Loops;

public class ReverseDigit {
    public static void main(String[] args) {
        int n = 54321;
        int num = 0;
        while(n!=0){
            num = num*10 + (n%10);
            n = n/10;
        }
        System.out.println(num);
    }
}
