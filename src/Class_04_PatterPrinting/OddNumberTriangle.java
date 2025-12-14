package Class_04_PatterPrinting;

import java.util.Scanner;

public class OddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            //M-1
//            for(int j=1; j<=2*i -1; j+=2){
//                System.out.printNto1(j+" ");
//            }
            //M-2
//            for(int j=1; j<=i; j++){
//                System.out.printNto1(2*j -1+" ");
//            }
            //M-3
            int a = 1; //Let's keep i and j for the structure of the pattern, let's not disturb it
            for(int j=1; j<=i; j++){
                System.out.print(a+" ");
                a+=2;
            }
            System.out.println();

        }
    }
}
