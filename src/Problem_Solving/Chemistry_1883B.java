package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class Chemistry_1883B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int[] freq = new int[26];
            for(int i=0; i<n; i++){
                freq[s.charAt(i)-'a']++;
            }
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            boolean distinct = false;
            for(int i=0; i<26-1; i++){
                if(arr[i]!=arr[i+1]){
                    distinct = true;
                    break;
                }
            }

            if(!distinct && k==n-1) System.out.println("YES");
            else {
                if(n%2==0){
                    int odds = 0;
                    for(int i=0; i<26; i++) if(freq[i]%2==1) odds++;

                    if(k>=(odds-1)) System.out.println("YES");
                    else System.out.println("NO");
                }
            }
        }
    }
}
