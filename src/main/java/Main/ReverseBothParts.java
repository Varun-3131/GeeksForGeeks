package Main;

public class ReverseBothParts {
    public static Node rev(Node x){
        Node Next=null;
        Node prev=null;
        Node curr=x;
        while(curr!=null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;

        }
        return prev;
    }
    public static Node reverse(Node head, int k) {
        // code here
        int i=1;
        Node temp=head;
        while(i<k && temp!=null){
            temp=temp.next;
            i++;
        }
        if (temp == null)
            return head;
        Node z=temp.next;
        temp.next=null;
        Node g=rev(head);
        Node b=rev(z);
        Node lastNode = g;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        lastNode.next = b;

        return g;

    }
}
