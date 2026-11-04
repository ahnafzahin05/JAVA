package Class_13_LinkedList;

public class reorderList {
    public static void main(String[] args) {

    }
    public void reorder(Node head){
        Node slow = head, fast = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        Node h2 = slow.next;
        slow.next = null;
        h2 = reverse(h2);
        Node newHead = new Node(0), d = newHead;

        while(head!=null){
            d.next = head;
            d = d.next;
            head = head.next;

            if(h2!=null){
                d.next = h2;
                d = d.next;
                h2 = h2.next;
            }
        }
        d.next = null;
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
