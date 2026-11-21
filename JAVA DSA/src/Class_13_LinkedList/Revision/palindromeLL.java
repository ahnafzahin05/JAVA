package Class_13_LinkedList.Revision;

public class palindromeLL {
    public static void main(String[] args) {

    }
    public boolean isPalindrome(Node head){
        Node tempA = head;
        Node slow = head, fast = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        Node tempB = reverse(slow);

        while(tempB!=null){
            if(tempA.val!=tempB.val) return false;
            tempB = tempB.next;
            tempA = tempA.next;
        }
        return true;
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
