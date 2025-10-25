package Problem_Solving;

import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = 0;
        char[] arr = s.toCharArray();
        for(int i=0; i<s.length()-5; i++){ //checking start of h
            if(arr[i] == 'h'){
                a = i;
                break;
            }
        }
        int[] freq = new int[4];
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='h') freq[0]++;
            else if(s.charAt(i)=='e') freq[1]++;
            else if(s.charAt(i)=='l') freq[2]++;
            else if(s.charAt(i)=='o') freq[3]++;
        }
        String ans = "";
        int i=a;
        for(; i<s.length()-1; i++){
            if(arr[i]=='h' || arr[i]=='e' || arr[i]=='l' || arr[i]=='o'){
                if(arr[i] != arr[i+1]) ans+=s.charAt(i);
            }
        }
        if(i==s.length()-1 && ans.length()==3) ans+=s.charAt(i);

        if(ans.equals("helo") && freq[0]>=1 && freq[1]>=1 && freq[2]>=2 && freq[3]>=1) System.out.println("YES");
            else System.out.println("NO");

    }
}
