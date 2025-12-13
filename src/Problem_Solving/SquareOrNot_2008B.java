package Problem_Solving;

import java.util.Scanner;

public class SquareOrNot_2008B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int length = sc.nextInt();
            String s = sc.next();

            int n = (int) Math.sqrt(length); //n x n matrix er n eita

            if(n>=2 & n==Math.sqrt(length)){
                int zeroCount = 0;
                for(int i=0; i<length; i++) if(s.charAt(i)=='0') zeroCount++;

                if(zeroCount==Math.pow(n-2,2)) System.out.println("YES");
                else System.out.println("NO");
            }
            else System.out.println("NO");
        }
    }
}
