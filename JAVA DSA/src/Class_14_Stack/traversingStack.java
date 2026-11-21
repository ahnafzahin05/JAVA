package Class_14_Stack;

import java.util.Stack;

public class traversingStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        Stack<Integer> st2 = new Stack<>();

        while(!st.isEmpty()){ //printing the stack
            int peek = st.pop();
            System.out.println(peek);
            st2.push(peek);
        }

        System.out.println();

//        while(!st2.isEmpty()){ //inserting the elements back into the stack, also reverse printing the stack
//            int top = st2.pop();
//            System.out.println(top);
//            st.push(top);
//        }
        while(!st2.isEmpty()){ //inserting the elements back into the stack
            st.push(st2.pop());
        }
    }
}
