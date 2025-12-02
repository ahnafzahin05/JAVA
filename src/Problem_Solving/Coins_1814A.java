package Problem_Solving;

import java.util.Scanner;

public class Coins_1814A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long k = sc.nextLong();

            if(n%2==0) System.out.println("YES"); //always yes for n = even
            else{ //n is odd
                if(k%2==0) System.out.println("NO");
                else System.out.println("YES");
            }
        }
    }
}
