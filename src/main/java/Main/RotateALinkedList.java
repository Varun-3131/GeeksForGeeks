package Main;

public class RotateALinkedList {
    public Node rotate(Node head, int k) {

        if(head == null)return null;

        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }

        int i = 1;
        while(i<=k){
            Node newNode = new Node(head.data);
            tail.next = newNode;
            tail = newNode;
            head = head.next;
            i++;
        }
        return head;
    }
}
