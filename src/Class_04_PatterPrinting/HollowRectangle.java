package Class_04_PatterPrinting;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n (row) = ");
        int n = sc.nextInt();
        System.out.print("m (column) = ");
        int m = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i==1 || i==n || j==1 || j==m) System.out.print("* "); //basically * kothay kothay print hobe shei cond diye dilei hoilo
                else System.out.print("  ");
            }
            System.out.println();
        }

//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=m; j++){
//                if(i==1 || i==n) System.out.print("* ");
//                else{
//                    if(j==1 || j==m) System.out.print("* ");
//                    else System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

    }
}
