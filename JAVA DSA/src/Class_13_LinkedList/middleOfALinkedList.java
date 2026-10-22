package Class_13_LinkedList;

public class middleOfALinkedList {
    public static void main(String[] args) {

    }

    private static int getMiddle(Node head){
        //SLOW FAST APPROACH
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.val;
//        int size = 0;
//        Node temp = head;
//        while(temp!=null){
//            temp = temp.next;
//            size++;
//        }
//        temp = head;
//        int idx = size/2;
//        for(int i=0; i<size; i++){
//            if(i==idx) return temp.val;
//            temp = temp.next;
//        }
//        return -1;
    }
}
