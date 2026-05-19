package Problem_Solving;

import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(yesNo(s));
    }
    public static String yesNo(String s){
        int count = 0;
        int i=0, j=1;
        while(j<s.length()){
            if(s.charAt(i) == s.charAt(j)) j++;
            else{
                count = j - i;
                i = j;
                j++;
            }
            if(count>=7) return "YES";
        }
        count = j - i;
        if(count>=7) return "YES";
        return "NO";
    }
}
