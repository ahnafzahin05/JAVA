package Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElementGfG {
    public static void main(String[] args) {

    }
    public ArrayList<Integer> nextLargerElement(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        ans[n-1] = -1;
        st.push(ans[n-1]);

        for(int i=n-2; i>=0; i--){
            while(!st.isEmpty() && arr[i]>=st.peek()) st.pop();

            if(st.isEmpty()) ans[i] = -1;
            else ans[i] = st.peek();

            st.push(arr[i]);

//            if(arr[i]<st.peek()){
//                ans[i] = st.peek();
//            }
//            else{
//                while(!st.isEmpty() && arr[i]>=st.peek()) st.pop();
//
//                if(st.isEmpty()) ans[i] = -1;
//                else ans[i] = st.peek();
//
//            }
//            st.push(arr[i]);
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (int x : ans) res.add(x);
        return res;
    }
}
