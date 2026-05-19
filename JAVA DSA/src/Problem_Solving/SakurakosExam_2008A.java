package Problem_Solving;

import java.util.Scanner;

public class SakurakosExam_2008A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt(); //No of '1's
            int b = sc.nextInt(); //No of '2's
            if(b%2==1){
                if(a%2==0 && a>0) System.out.println("YES");
                else System.out.println("NO");
            }
            else{
                if(a%2==0) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
