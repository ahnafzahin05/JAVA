package Class_14_Stack;

import java.util.Stack;

public class parenthesesChecker_GfG {
    public static void main(String[] args) {

    }
    public boolean isBalanced(String s){
        if(s.length()%2!=0) return false;

        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch=='(' || ch=='{' || ch=='[') st.push(ch);
            else{
                if(st.isEmpty()) return false;

                char top = st.peek();
                if(sameStyle(top,ch)) st.pop();
                else return false;
            }
        }

        return st.isEmpty();
    }
    public boolean sameStyle(char open, char close){
        if(open=='(' && close==')') return true;
        else if(open=='{' && close=='}') return true;
        else if(open=='[' && close==']') return true;
        else return false;
    }
}
