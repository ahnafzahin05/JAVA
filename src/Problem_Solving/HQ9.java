package Problem_Solving;

import java.util.Scanner;

public class HQ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        boolean flag = false;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='H' || ch=='Q' || ch=='9' || (ch=='+' && i==s.length()-1) && i!=0){
                flag = true;
                break;
            }
        }

        if(flag) System.out.println("YES");
        else System.out.println("NO");
    }
}
