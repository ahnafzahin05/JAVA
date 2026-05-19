package Problem_Solving;

import java.util.Scanner;

public class LoveStory_1829A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=1; t<=test; t++){
            String s = sc.next();
            int count = 0;
            String cf = "codeforces";
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)!=cf.charAt(i)) count++;
            }
            System.out.println(count);
        }
    }
}
