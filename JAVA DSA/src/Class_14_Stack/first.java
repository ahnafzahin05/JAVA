package Class_14_Stack;

import java.util.Stack;

public class first {
    public static void main(String[] args) {
//        Stack<Integer> st = new Stack<>();
//        st.push(50);
//        st.push(10);
//        st.push(20);
//        st.push(40);
//        System.out.println(st);
//        System.out.println(st.peek());
//        st.pop();
//        System.out.println(st);
//        System.out.println(st.size());
//        //push, pop, peek --> O(1)

        Stack<String> s = new Stack<>();

        System.out.println(s.isEmpty());
        System.out.println(s.size()==0);

        s.push("Shahreen");
        s.push("Adiba");
        s.push("Ahnaf");
        s.push("Zahin");
        s.push("Wasif");

        System.out.println(s);
        s.pop(); //removes the peek
        System.out.println(s.pop()); //removes the peek and returns it, so we can store it as well if needed
        System.out.println(s);
    }
}
