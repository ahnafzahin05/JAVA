package Class_13_LinkedList;

public class displayList {
    public static void main(String[] args) {
        Node a = new Node(10); //head node
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        displayRecursively(a);
        //display(a);
    }

    private static void display(Node head) {
        Node temp = head;
        while(temp!=null){ //null e chole jawa manei node sesh
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

    public static void displayRecursively(Node head){
        if(head==null) return;
        System.out.print(head.val+" ");
        displayRecursively(head.next);

//        if(head==null) return; //print reverse
//        displayRecursively(head.next);
//        System.out.print(head.val+" ");
    }
}
