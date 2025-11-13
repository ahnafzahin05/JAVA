package Problem_Solving;

import java.util.Scanner;

public class ExpensiveNumber_2093B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=1; t<=test; t++){
            String s = sc.next();

            long firstDigIdx = -1;
            for(int i = s.length()-1; i>=0; i--){
                if(s.charAt(i)>'0') {
                    firstDigIdx=i;
                    break;
                }
            }

            long leftDig = 0;
            for(int i=0; i<firstDigIdx; i++){
                if(s.charAt(i)>'0') leftDig++;
            }

            long minOps = (s.length()-1-firstDigIdx) + leftDig;
            System.out.println(minOps);
        }
    }
}
