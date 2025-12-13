package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class SymmetricEncoding_1974B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String b = sc.next();

            char[] str = b.toCharArray();
            Arrays.sort(str);

            StringBuilder r = new StringBuilder();
            r.append(str[0]);
            for(int i=1; i<n; i++) if(str[i]!=str[i-1]) r.append(str[i]); //we got the distinct ascending ordered string

            StringBuilder ans = new StringBuilder();
            for(int i=0; i<n; i++){
                char ch = b.charAt(i);
                for(int j=0; j<r.length(); j++){
                    if(r.charAt(j)==ch){
                        ans.append(r.charAt(r.length()-j-1));
                        break;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
