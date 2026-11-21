package Class_14_Stack;

import java.util.Stack;

public class removeNodesFromLL {
    public static void main(String[] args) {

    }
    public Node removeNodes(Node head) {
        Stack<Node> st = new Stack<>();
        //T.C = O(n)
        Node temp = head;
        while (temp != null) {
            if (st.isEmpty()) st.push(temp);
            else if (temp.val <= st.peek().val) st.push(temp);
            else if (temp.val > st.peek().val) {
                while (!st.isEmpty() && st.peek().val < temp.val) st.pop();
                st.push(temp);
            }
            temp = temp.next;
        }

        while (!st.isEmpty()) {
            Node top = st.pop();
            top.next = temp;
            temp = top;
        }
        return temp;
    }
}
