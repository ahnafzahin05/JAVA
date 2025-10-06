package Problem_Solving;

import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int firstIdx = -1, lastIdx = -1;
        boolean flag = false;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)=='h' || s.charAt(i)=='e' || s.charAt(i)=='l' || s.charAt(i)=='o'){
                firstIdx = i;
                flag = true;
            }
            else if((s.charAt(i)=='h' || s.charAt(i)=='e' || s.charAt(i)=='l' || s.charAt(i)=='o') && (s.charAt(i+1)!='h' && s.charAt(i+1)!='e' && s.charAt(i+1)!='l' && s.charAt(i+1)!='o') && flag) lastIdx = i;
        }
        int length = Math.abs(lastIdx - firstIdx);
        char[] arr = new char[length];
        for(int i=firstIdx, j=0; i<=lastIdx; i++, j++){
            arr[j] = s.charAt(i);
        }
        String valid = "helo";
        String found = "";
        int i=0;
        for(; i<length-1; i++){
            if(arr[i]!=arr[i+1]) found+=arr[i];
        }
        found+=arr[i];
        if(valid.equals(found)) System.out.println("YES");
        else System.out.println("NO");
    }
}
