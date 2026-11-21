package Class_14_Stack;

import java.util.Stack;

public class getAtIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        //get method, get(idx) | stack is indexed 0 at the bottom
        int idx = 99;
        Stack<Integer> st2 = new Stack<>();

        while(st.size()>idx+1) st2.push(st.pop());
        System.out.println(st.peek());
        while(!st2.isEmpty()) st.push(st2.pop());


    }
}
