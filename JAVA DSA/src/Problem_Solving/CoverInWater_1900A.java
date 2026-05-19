package Problem_Solving;

import java.util.Scanner;

public class CoverInWater_1900A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            int n = sc.nextInt();
            String s = sc.next();
            int count = 1, total = 0; boolean flag = false;

            for(int i=0; i<n-1; i++){
                if(s.charAt(i) == s.charAt(i+1) && s.charAt(i) == '.'){
                    count++;
                    if(count==3) {
                        flag = true;
                        break;
                    }
                }
                else count = 1;
            }

            if(flag) System.out.println("2");
            else {
                for(int i=0; i<n; i++) if(s.charAt(i)=='.') total++;
                System.out.println(total);
            }
        }
    }
}
