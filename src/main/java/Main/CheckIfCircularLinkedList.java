package Main;

public class CheckIfCircularLinkedList {

    boolean isCircular(Node head)
    {
        if(head == null) return true;
        Node current = head.next;
        while(current != null){
            if(current == head) return true;
            current = current.next;
        }
        return false;
    }
}
