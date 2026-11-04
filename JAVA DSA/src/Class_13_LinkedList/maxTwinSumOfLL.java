package Class_13_LinkedList;

public class maxTwinSumOfLL {
    public static void main(String[] args) {

    }
    public int pairSum(Node head){
        Node fast = head, slow = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        Node newHead = slow.next;
        slow.next = null;
        newHead = reverse(newHead);

        Node t1 = head, t2 = newHead;
        int maxSum = 0;
        while(t1!=null){
            maxSum = Math.max(maxSum, (t1.val+t2.val));
            t1 = t1.next;
            t2 = t2.next;
        }
        return maxSum;
    }
    public Node reverse(Node head){
        Node prev = null, f = null;
        Node curr = head;

        while(curr!=null){
            f = curr.next;
            curr.next = prev;
            prev = curr;
            curr = f;
        }
        return prev;
    }
}
