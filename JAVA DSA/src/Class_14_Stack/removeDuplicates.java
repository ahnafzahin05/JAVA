package Class_14_Stack;

import java.util.Stack;

public class removeDuplicates {
    public static void main(String[] args) {

    }
    public String removeDuplicate(String s){
        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if (st.isEmpty() || st.peek() != ch) st.push(ch);
        }

        String ans = "";
        while(!st.isEmpty()) ans = st.pop() + ans;
        return ans;
    }
}
