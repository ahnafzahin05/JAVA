package Problem_Solving;

import java.util.Scanner;

public class RecoveringASmallString_1931A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int k = sc.nextInt();
            StringBuilder ans = new StringBuilder();

            if(k<=28){
                ans.append('a');
                ans.append('a');
                ans.append((char)('a'+ k-3));
            }
            else if(k<=53){
                ans.append('a');
                ans.append((char) ('a' + k-28));
                ans.append('z');
            }
            else{
                ans.append((char)('a'+k-53));
                ans.append('z');
                ans.append('z');
            }
            System.out.println(ans);
        }
    }
}
