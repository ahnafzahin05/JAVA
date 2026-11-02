package Class_13_LinkedList;

public class removeDuplicateFromSortedLL {
    public static void main(String[] args) {

    }
    public static Node removeDuplicates(Node head){
        if(head==null || head.next==null) return head;

        Node dummy = new Node(-1);
        dummy.next = head;
        Node temp = dummy;
        Node i = head;

        while(i.next!=null){
            if(i.next.val!=i.val){
                temp.next = i;
                temp = i;
            }
            i = i.next;
        }
        temp.next = i;

        return dummy.next;
//        Node temp = head;
//        Node i = head;
//        while(temp!=null){
//            if(temp.next!=null && temp.val==temp.next.val) temp = temp.next;
//            else{
//                i.next = temp.next;
//                i = temp.next;
//                temp = temp.next;
//            }
//        }
//        while(temp!=null){
//            if(temp.val==i.val) temp = temp.next;
//            else{
//                i.next = temp;
//                i = temp;
//            }
//        }
//        if(i!=null) i.next = temp;
       //return head;
    }
}
