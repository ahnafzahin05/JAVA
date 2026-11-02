package Revision;

public class middleOfALL {
    public static void main(String[] args) {

    }
    public static int middleElement(Node head){
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.val;
    }
}
