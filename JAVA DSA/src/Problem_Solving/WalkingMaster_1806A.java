package Problem_Solving;

import java.util.Scanner;

public class WalkingMaster_1806A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            if(d<b) System.out.println("-1");
            else if(d==b){
                if(c<=a) System.out.println(Math.abs(c-a));
                else System.out.println("-1");
            }
            else{ //d>b
                int diff = d-b;
                if((diff+a)<c) System.out.println("-1");
                else System.out.println(diff+(a+diff)-c);
            }
        }
    }
}
