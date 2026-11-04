package Class_13_LinkedList;

public class addTwoNumbers {
    public static void main(String[] args) {

    }
    public Node add(Node l1, Node l2){
        l1 = reverse(l1);
        l2 = reverse(l2);
        int carry = 0;

        while(l1!=null )
    }
    public Node reverse(Node head){
        Node prev = null, f = null, curr = head;
        while(curr!=null){
            f = curr.next;
            curr.next = prev;
            prev = curr;
            curr = f;
        }
        return prev;
    }
}
