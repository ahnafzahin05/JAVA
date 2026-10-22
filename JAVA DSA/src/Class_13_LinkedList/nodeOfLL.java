package Class_13_LinkedList;


public class nodeOfLL {
    public static void main(String[] args) {
        Node a = new Node(10); //head node
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        //null is a reference point that defines the end
        System.out.println(a);
        System.out.println(a.next); //b
        System.out.println(b);
        System.out.println(a.next.next); //c
        System.out.println(b.next); //c
        System.out.println(c);

        System.out.println(a.next.next.next.val); //val of d
    }
}
