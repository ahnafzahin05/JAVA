package Revision;

import java.util.Stack;

public class removeConsecutiveCharacters_GfG {
    public static void main(String[] args) {

    }
    public String removeDuplicates(String s){
        Stack<Character> st = new Stack<>();
        String ans = "";

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(st.isEmpty()){
                st.push(ch);
                ans+=ch;
            }
            else if(st.peek()!=ch){
                st.push(ch);
                ans+=ch;
            }
        }

        return ans;


    }
}
