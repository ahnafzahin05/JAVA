package Class_14_Stack;

import java.sql.Array;
import java.util.Stack;

public class reverseStackInPlace {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println(st);

        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3 = new Stack<>();

        while(!st.isEmpty()) st2.push(st.pop());
        while(!st2.isEmpty()) st3.push(st2.pop());
        while(!st3.isEmpty()) st.push(st3.pop());

        System.out.println(st);

        //by array
        int[] arr = new int[st.size()];
        for(int i=0; i<arr.length; i++) arr[i] = st.pop();
        for(int i=0; i<arr.length; i++) st.push(arr[i]);

        System.out.println(st);
    }
}
