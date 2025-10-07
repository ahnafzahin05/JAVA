package Problem_Solving;

import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int firstIdx = -1;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='h' || ch=='e' || ch=='l' || ch=='o'){
                firstIdx = i;
                break;
            }
        }
        String found = "";
        for(int i=firstIdx; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='h' || ch=='e' || ch=='l' || ch=='o') found+=ch;
            else break;
        }
        String hello = "hello";
        int i=0, j=1;
        //while()
//        if(valid.equals(found)) System.out.println("YES");
//        else System.out.println("NO");
    }
}
