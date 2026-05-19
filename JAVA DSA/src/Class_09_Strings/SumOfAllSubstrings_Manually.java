package Class_09_Strings;

import java.util.Scanner;

public class SumOfAllSubstrings_Manually {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            String sub = "";
            for(int j=i; j<s.length(); j++){
                sub+=s.charAt(j);
                sum+=Integer.parseInt(sub);
            }
        }
        System.out.println(sum);
    }
}
