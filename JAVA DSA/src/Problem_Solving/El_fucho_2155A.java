package Problem_Solving;

import java.util.Scanner;

public class El_fucho_2155A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=1; t<=test; t++){
            int n = sc.nextInt();
            int w = n, l = 0, pw = 0, pl = 0, count = 0;
            while(w>1){

                pw = w/2;
                w = w - pw;

                pl = l/2;
                l = l - pl;

                l = l+pw;
                count = pw + pl;

            }
            System.out.println(count);
        }
    }
}
