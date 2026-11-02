package Class_13_LinkedList;

public class deleteNodeInLL_LeetCode237 {
    public static void main(String[] args) {

    }
    public void deleteNode(Node node){
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
