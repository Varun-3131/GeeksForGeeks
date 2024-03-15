package Main;

public class DoublyLinkedList {
    Node constructDLL(int arr[]) {
        // Code here
        if(arr.length==0) return null;
        Node head = new Node(arr[0]);
        Node prev = head;
        Node curr;
        for(int i=1; i<arr.length; i++){
            curr = new Node(arr[i]);
            curr.prev = prev;
            prev.next = curr;
            prev = curr;
        }
        return head;
    }
}
