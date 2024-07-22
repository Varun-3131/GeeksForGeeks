package Main;

public class Add_1_ToALinkedListNumber {
    public static boolean add( Node node )
    {
        if( node.next == null || add( node.next) )
        {
            node.data = (node.data + 1) % 10;
            return node.data == 0;
        }

        return false;
    }
    public static Node addOne(Node head)
    {

        if( add(head) )
        {
            Node newhead = new Node(1);
            newhead.next = head;
            return newhead;
        }

        return head;

    }
}
