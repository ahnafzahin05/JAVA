package Class_13_LinkedList;

public class removeDuplicateFromSortedLL {
    public static void main(String[] args) {

    }
    public static Node removeDuplicates(Node head){
        Node temp = head;
        Node i = head;
        while(temp!=null){
            if(temp.next!=null && temp.val==temp.next.val) temp = temp.next;
            else{
                i.next = temp.next;
                i = temp.next;
                temp = temp.next;
            }
        }
//        while(temp!=null){
//            if(temp.val==i.val) temp = temp.next;
//            else{
//                i.next = temp;
//                i = temp;
//            }
//        }
//        if(i!=null) i.next = temp;
        return head;
    }
}
