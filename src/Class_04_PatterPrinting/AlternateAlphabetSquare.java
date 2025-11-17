package Class_04_PatterPrinting;

import java.util.Scanner;

public class AlternateAlphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i%2==0) System.out.print((char) ('A'-1+i));
                else System.out.print((char)('a'-1+i));
            }
            System.out.println();
        }
    }
}
