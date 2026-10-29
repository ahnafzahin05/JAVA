package Problem_Solving;

import java.util.Scanner;

public class constructARectangle_1622A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a==(b+c) || b==(a+c) || c==(a+b)) System.out.println("YES");
            else if(a==b || b==c || a==c) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
