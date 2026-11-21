package Revision;

import java.util.Stack;

public class baseballGameLC {
    public static void main(String[] args) {

    }
    public int calPoints(String[] operations){
        Stack<Integer> st = new Stack<>();
        int ans = 0;

        for(int i=0; i<operations.length; i++){
            String s = operations[i];

            if(s.equals("+")){
                int top1 = st.pop(), top2 = st.pop();
                int newTop = top1+top2;

                st.push(top2);
                st.push(top1);
                st.push(newTop);

                ans+=newTop;
            }
            else if(s.equals("D")){
                int newTop = 2*st.peek();
                st.push(newTop);

                ans+=newTop;
            }
            else if(s.equals("C")){
                if(!st.isEmpty()){
                    ans-= st.peek();
                    st.pop();
                }
            }
            else{
                int newTop = Integer.parseInt(s);
                st.push(newTop);
                ans+=newTop;
            }
        }

        return ans;
    }
}
