package Class_03_Loops;

import java.util.Scanner;

public class MinsBeforeNewYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i<=t; i++){
            int h = sc.nextInt();
            int m = sc.nextInt();
            int remH = 23 - h;
            int remM = 60 - m;
            int totalM = remH*60 + remM;
            System.out.println(totalM);
        }
    }
}
