package Problem_Solving;

import java.util.Scanner;

public class DifferentString_1971B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int n = s.length();

            if(n==1) System.out.println("NO");
            else{
                boolean allSame = true;
                for(int i=0; i<n-1; i++){
                    if(s.charAt(i)!=s.charAt(i+1)){
                        allSame = false;
                        break;
                    }
                }

                if(allSame) System.out.println("NO");
                else{
                    char[] str = s.toCharArray();
                    for(int i=0; i<n-1; i++){
                        if(str[i]!=str[i+1]){
                            char temp = str[i];
                            str[i] = str[i+1];
                            str[i+1] = temp;
                            break;
                        }
                    }
                    String ans = new String(str);
                    System.out.println("YES");
                    System.out.println(ans);
                }
            }
        }
    }
}
