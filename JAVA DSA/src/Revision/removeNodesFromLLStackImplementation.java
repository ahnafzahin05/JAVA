package Revision;

import java.util.Stack;

public class removeNodesFromLLStackImplementation {
    public static void main(String[] args) {

    }
    public Node removeNodes(Node head){
        head = reverse(head);
        Node temp = head;
        Stack<Node> st = new Stack<>();

        st.push(temp);
        temp = temp.next;

        while(temp!=null){
            if(temp.val>=st.peek().val) st.push(temp);
            temp = temp.next;
        }

        head = st.pop();
        temp = head;
        while(!st.isEmpty()){
            temp.next = st.pop();
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    public Node reverse(Node head){
        Node prev = null, frd = null, curr = head;

        while(curr!=null){
            frd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = frd;
        }

        return prev;
    }
}
