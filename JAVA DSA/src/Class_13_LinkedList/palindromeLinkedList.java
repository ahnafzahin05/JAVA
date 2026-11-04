package Class_13_LinkedList;

public class palindromeLinkedList {
    public static void main(String[] args) {

    }
    public boolean isPalindrome(Node head){
        Node fast = head, slow = head;

        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        Node newHead = slow.next;
        slow.next = null;
        newHead = reverse(newHead);

        Node t1 = head, t2 = newHead;
        while(t2!=null){ //t1 will never be shorter than t2
            if(t1.val!=t2.val) return false;
            t1 = t1.next;
            t2 = t2.next;
        }
        return true;
    }
    public Node reverse(Node head){
        Node prev = null, fwd = null;
        Node curr = head;
        while(curr!=null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
}
