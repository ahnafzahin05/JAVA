package Problem_Solving;

import java.util.Scanner;

public class DontTryToCount_1881A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();

            int ops = 0, i=1;
            boolean flag = false;
            while(i<=5){
                if(x.contains(s)) {
                    flag = true;
                    break;
                }
                else{
                    x+=x;
                    ops++;
                }
                i++;
            }
            if(x.contains(s)) flag = true;
            if(!flag) System.out.println("-1");
            else System.out.println(ops);
        }
    }
}
