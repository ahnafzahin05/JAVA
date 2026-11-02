package Class_13_LinkedList;

public class removeNthNodeFromEndofLL {
    public static void main(String[] args) {

    }
    public Node removeNthFromEnd(Node head, int n){
        Node fast = head;
        Node slow = head;

        for(int i=1; i<=n; i++) fast = fast.next;
        if(fast==null) return head.next;

        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return head;

        //using dummy
        // if(head.next==null) return null;

        // ListNode fast = head;
        // //ListNode slow = head;
        // ListNode dummy = new ListNode(-1);
        // dummy.next = head;
        // ListNode temp = dummy;



        // for(int i=1; i<=n; i++){
        //     fast = fast.next;
        // }

        // while(fast!=null){
        //     temp = temp.next;
        //     //slow = slow.next;
        //     fast = fast.next;
        // }

        // temp.next = temp.next.next;
        // return dummy.next;




        //using a prev node
//        if(head==null || head.next==null) return null;
//
//        Node fast = head;
//        Node slow = head;
//        Node prev = null;
//
//        for(int i=1; i<=n; i++){
//            fast = fast.next;
//        }
//
//        while(fast!=null){
//            prev = slow;
//            slow = slow.next;
//            fast = fast.next;
//        }
//
//        if(slow==head){
//            head = head.next;
//            return head;
//        }
//
//        prev.next = slow.next;
//        return head;
    }
}
